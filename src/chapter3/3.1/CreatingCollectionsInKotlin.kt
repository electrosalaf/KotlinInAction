package chapter3.CreatingCollectionsInKotlin

val set = hashSetOf(1, 7, 53)
val list = listOf(1, 7, 53)
val map = hashMapOf(1 to "One", 7 to "Seven", 53 to "Fifty-three")

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}