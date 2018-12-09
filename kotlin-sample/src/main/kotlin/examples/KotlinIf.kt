package examples

fun main(args: Array<String>) {
    val isTest = args.size > 1 && args[0].contains("test")
    val param = if (isTest.not())
        "Product Param"
    else
        "Test Param"
    println(param);
}