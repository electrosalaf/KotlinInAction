@file:JvmName("StringFunction")

package chapter3.JoinToStringBetter

import java.lang.StringBuilder

fun <T> joinToString (
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1,3,5)
    println(joinToString(list, ", ", "", ""))
    println(joinToString(list))
    println(joinToString(list, "; "))
    println(joinToString(list, prefix = "# "))
}