package jp.john.satoh.springkotlinsample.controller

import jp.john.satoh.springkotlinsample.controller.response.UserSearchData
import jp.john.satoh.springkotlinsample.other.domain.User
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
    fun search(@RequestParam("name", required = false) name: String?): List<UserSearchData> {
        // userのリストを返却する
        // searchUserService.searchByName(name) はだめですよ
        val user1 = User("", "", "")
        user1.mailAddress = ""
        return when {
            !name.isNullOrBlank() -> searchUserService.searchByName(name)
            else -> emptyList()
        }.map { user -> UserSearchData(user.name, user.mailAddress) }
    }


}