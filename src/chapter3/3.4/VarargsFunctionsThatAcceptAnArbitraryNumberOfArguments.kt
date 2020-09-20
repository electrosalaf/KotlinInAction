package chapter3.VarargsFunctionsThatAcceptAnArbitraryNumberOfArguments

import javax.print.attribute.standard.MediaSize

fun main (args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)

    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(map)

    val (number, name) = 1 to "One"
}
