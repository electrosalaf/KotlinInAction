package chapter3.CreatingCollectionsInKotlin1

fun main(args: Array<String>) {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 43, 78)
    print(numbers.first())
    println(numbers.max())
}

