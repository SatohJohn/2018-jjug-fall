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

    fun searchByUid(uid: String): User? {
        // val result: User としてもコンパイルは通ってしまう
        // が仕様としては val result: User? が正しく
        // コンパイラとしては val result: User! となっている
        val result = userRepository.findByUid(uid)

        // println(result.mailAddress) では落ちる可能性がある
        println(result?.mailAddress)
        return result
    }
}