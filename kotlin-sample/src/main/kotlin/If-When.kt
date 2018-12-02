fun returnIFValue(): Int = if(true) 1 else 2
fun isKeep(): Boolean = true
fun isNotKeep(): Boolean = !isKeep()

fun returnWhenValue(): Int {
    val hoge = "hogehoge"
    return when {
        hoge.equals("hogehogh") -> 1
        hoge.equals("yaaaa") -> 2
        else -> 0
    }
}

fun main(args: Array<String>) {
    println(returnIFValue());
}