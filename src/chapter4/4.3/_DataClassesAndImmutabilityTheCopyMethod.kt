package chapter4._DataClassesAndImmutabilityTheCopyMethod

class Client(val name: String, val postalCode: Int ) {
    fun copy(name: String = this.name,
             postalCode: Int = this.postalCode) =
        Client(name, postalCode)
}

fun main(args: Array<String>) {
    val bob = Client("Bob", 987845)
    println(bob.copy(postalCode = 382464))
}