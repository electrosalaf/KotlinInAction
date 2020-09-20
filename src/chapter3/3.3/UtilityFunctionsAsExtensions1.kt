package chapter3.UtilityFunctionsAsExtensions1

import java.lang.StringBuilder

fun <T> Collection<T>.toJoinString (
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = arrayListOf(1,2,3)
    println(list.toJoinString(" "))
}