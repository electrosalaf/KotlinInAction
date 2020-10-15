package chapter4._DataClassesAndImmutabilityTheCopyMethod1

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 968584)
    println(bob.copy(postalCode = 847738))
}

