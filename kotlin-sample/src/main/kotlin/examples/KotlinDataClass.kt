package examples

data class User(
        val uid: String,
        val name: String,
        val mailAddress: String
)

fun main(args: Array<String>) {
    val (uid, name) = User("uid", "name", "mailAddress")
    println("${uid}, ${name}")
}

