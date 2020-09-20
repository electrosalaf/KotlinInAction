data class Person(val firstName: String,
                  val lastName: String? = "Lawal",
                  val age: Int? = null )

fun main (args: Array<String>) {
    val persons = listOf(Person("Muhammad"),
        Person("Zainab", age = 11),
        Person("Ibrahim", age = 24),
        Person("Azeez", "Aremu", 21))

    val youngest = persons.minBy { it.age ?: 0 }
    val oldest = persons.maxBy { it.age ?: 0 }

    println("The youngest person is: $youngest")
    println("The oldest person is: $oldest")
    println()
}
