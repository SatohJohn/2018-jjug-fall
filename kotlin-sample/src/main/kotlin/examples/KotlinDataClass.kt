package examples

data class User(
        val uid: String,
        val name: String,
        val mailAddress: String
)

fun main(args: Array<String>) {
    // 分割で受け取ることが可能
//    var (uid, name) = User("uid", "name", "mailAddress")
//    println("${uid}, ${name}")
    // _を使うとその部分は使わないということが可能
//    var (_, name) = User("uid", "name", "mailAddress")
//    println("${name}")
    // 順番が大事で name には"uid"が入る
    var (name) = User("uid", "name", "mailAddress")
    println("${name}")
}

