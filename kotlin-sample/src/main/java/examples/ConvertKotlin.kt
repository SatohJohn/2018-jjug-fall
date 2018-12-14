package examples

import java.util.*

class ConvertKotlin {

    inner class User(private val name: String)

    fun createTestList(): List<User> {
        val names = ArrayList<String>()
        names.add("john")
        names.add("bob")
        names.add("alice")
        return names
                .map { name -> User(name) }
    }
}
