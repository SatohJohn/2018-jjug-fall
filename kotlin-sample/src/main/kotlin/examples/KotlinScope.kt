package examples

private class TestObject(val param: String)

fun main(args: Array<String>) {
    val testObject: TestObject = "parameter".also { param ->
        println(param)
    }.let { param ->
        create(param.toUpperCase())
    }
}

private fun create(param: String) = TestObject(param)