package chapter4.ObjectEqualityEquals1

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {             //  "other Any?": A nullable type meaning "other" can be null
        if (other == null || other !is Client)              //  Check whether "other" is a client
            return false

        return name == other.name &&                        //  Check whether the corresponding properties are equal
                postalCode == other.postalCode
    }

    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val processed = setOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))
}