package chapter2.IteratingOverMaps

import java.util.TreeMap

fun main (Args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'G') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}
