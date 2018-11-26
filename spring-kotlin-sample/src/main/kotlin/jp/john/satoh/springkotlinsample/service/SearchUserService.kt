package jp.john.satoh.springkotlinsample.service

import jp.john.satoh.springkotlinsample.other.domain.User
import jp.john.satoh.springkotlinsample.other.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class SearchUserService(
        val userRepository: UserRepository
) {

    fun searchByName(name: String): List<User> {
        // getがついているものはプロパティとして認識され省略されます
        return userRepository.all.filter { user -> user.name.equals(name) }
    }
}