package examples

import Account

fun let(id: String): Account {
    return id.let {
        val account = Account()
        account.id = it
        account
    }
}

fun apply(): Account {
    return Account().apply {
        id = "aaaaa"
    }
}

fun main(args: Array<String>) {
    println(let("aaaaa"))
    println(apply())
}
