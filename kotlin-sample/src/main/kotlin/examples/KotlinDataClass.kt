package examples

data class User(
        val uid: String,
        val name: String,
        val mailAddress: String
)

fun main(args: Array<String>) {
//    var (uid, name) = User("uid", "name", "mailAddress")
//    println("${uid}, ${name}")
//    var (_, name) = User("uid", "name", "mailAddress")
//    println("${name}")
    var (name) = User("uid", "name", "mailAddress")
    println("${name}")
}

