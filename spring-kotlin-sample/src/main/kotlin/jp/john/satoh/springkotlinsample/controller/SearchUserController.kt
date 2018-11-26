package jp.john.satoh.springkotlinsample.controller

import jp.john.satoh.springkotlinsample.controller.response.UserSearchData
import jp.john.satoh.springkotlinsample.service.SearchUserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("users")
class SearchUserController(
        val searchUserService: SearchUserService
) {

    @GetMapping("list")
    fun search(@RequestParam("name", required = false) name: String?): List<UserSearchData> {
        // userのリストを返却する
        // searchUserService.searchByName(name) はだめですよ
        return when {
            !name.isNullOrBlank() -> searchUserService.searchByName(name)
            else -> emptyList()
        }.map { user -> UserSearchData(user.name, user.mailAddress) }
    }


}