package jp.john.satoh.springkotlinsample.controller;

import jp.john.satoh.springkotlinsample.controller.response.UserSearchData;
import jp.john.satoh.springkotlinsample.service.SearchUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("java/users")
public class SearchUserJavaController {
    private SearchUserService searchUserService;

    public SearchUserJavaController(SearchUserService searchUserService) {
        this.searchUserService = searchUserService;
    }

    @GetMapping("list")
    @ResponseBody
    public List<UserSearchData> list(
            @RequestParam(value = "name", required = false) String name
    ) {
        if (name == null || name.isEmpty()) {
            return Collections.emptyList();
        }
        return searchUserService.searchByName(name)
                .stream()
                .map(user -> new UserSearchData(user.getName(), user.getMailAddress()))
                .collect(Collectors.toList());
    }

    @GetMapping("/")
    @ResponseBody
    public UserSearchData mono(
            @RequestParam(value = "uid", required = false) String uid
    ) {
        if (uid == null) {
            return UserSearchData.Companion.createEmpty();
        }
        return Optional.ofNullable(searchUserService.searchByUid(uid))
                .map(user -> new UserSearchData(user.getName(), user.getMailAddress()))
                .orElse(UserSearchData.Companion.createEmpty());
    }

}