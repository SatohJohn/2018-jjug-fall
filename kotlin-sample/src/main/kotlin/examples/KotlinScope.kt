package examples

private class TestObject(val param: String)

fun main(args: Array<String>) {
    val testObject: TestObject = "parameter"
            .also { println(it) }
            .let { create(it.toUpperCase()) }
}

private fun create(param: String) = TestObject(param)