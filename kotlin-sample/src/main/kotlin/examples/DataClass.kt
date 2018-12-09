package examples

import java.util.*

data class User(
        val uid: String,
        val name: String,
        val mailAddress: String
)

fun main(args: Array<String>) {
    // 分割代入の例
    val (uid, name) = User("uid", "name", "mailAddress")
    println("${uid}, ${name}")

    // Mapとか使いやすいかも
    val maps = HashMap<String, Int>().apply {
        put("one", 1)
        put("two", 2)
        put("three", 3)
    }
    for ((key, value) in maps) {
        println("${key}, ${value}.")
    }
}

