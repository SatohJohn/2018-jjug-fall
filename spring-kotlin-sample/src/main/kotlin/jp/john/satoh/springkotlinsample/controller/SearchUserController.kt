package jp.john.satoh.springkotlinsample.controller

import jp.john.satoh.springkotlinsample.controller.response.UserSearchData
import jp.john.satoh.springkotlinsample.service.SearchUserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("users")
class SearchUserController(
        val searchUserService: SearchUserService
) {

    @GetMapping("list")
    @ResponseBody
    fun list(
            @RequestParam("name", required = false) name: String?
    ): List<UserSearchData> {
        return when {
            !name.isNullOrBlank() -> searchUserService.searchByName(name)
            else -> emptyList()
        }.map { user -> UserSearchData(user.name, user.mailAddress) }
    }

    @GetMapping("/")
    @ResponseBody
    fun mono(
            @RequestParam("uid", required = false) uid: String?
    ): UserSearchData {
        return uid?.let {
            searchUserService.searchByUid(it)?.let { user ->
                UserSearchData(user.name, user.mailAddress)
            }
        } ?: UserSearchData.createEmpty()
    }


}