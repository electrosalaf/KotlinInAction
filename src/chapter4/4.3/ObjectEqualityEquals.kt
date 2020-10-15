package chapter4.ObjectEqualityEquals

class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client("Ibrahim", 245747)
    val client2 = Client("Nafeesah", 656893)
    println(client1 == client2)
}

