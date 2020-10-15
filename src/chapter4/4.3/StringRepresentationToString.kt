package chapter4.StringRepresentationToString

class Client (val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("Ibrahim Lawal", 238675)
    println(client1)
}