package chapter3.ThisWillGiveError

fun
        Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main (args: Array<String>) {
    println(listOf("One", "Two", "Three").join(" "))
//    listOf(1,2,3).join()
}