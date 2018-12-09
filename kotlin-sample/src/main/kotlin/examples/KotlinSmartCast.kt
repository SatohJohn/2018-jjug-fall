package examples

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

interface Base {
    fun isA() : Boolean
}

class A : Base {
    override fun isA(): Boolean = true
    fun doSomethingA() = println("A")
}

class NotA : Base {
    override fun isA(): Boolean = false
    fun doSomethingNotA() = println("NotA")
}

@ExperimentalContracts
fun main(args: Array<String>) {
    val create:Base = A()
    if (create.test()) {
        create.doSomethingA()
    } else {
        create.doSomethingNotA()
    }
}

@ExperimentalContracts
fun Base.test(): Boolean {
    contract {
        returns(true) implies (this@test is A) // trueが変えるならBaseはAであるということができる
        returns(false) implies (this@test is NotA)
    }
    return isA();
}
