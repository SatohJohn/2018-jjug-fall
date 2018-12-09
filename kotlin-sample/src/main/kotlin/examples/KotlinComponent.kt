package examples

private fun getStringData(): Pair<String, Int> {
    val str = "string"
    return Pair(str, str.length)
}

fun main(args: Array<String>) {
    val (str, length) = getStringData()
    println("${str}, ${length}")
}