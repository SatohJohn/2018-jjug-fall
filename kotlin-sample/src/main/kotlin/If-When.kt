fun returnIFValue (): Int {
    return if (true) {
        1
    } else {
        2
    }
}

fun main(args: Array<String>) {
    print(returnIFValue());
}