package chapter2.UsingWhenWithArbitraryObjects

import chapter2.colors.Color
import chapter2.colors.Color.*

fun mix (c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO

        else -> throw Exception("Oops, dirty color!!!")
    }


fun main (args: Array<String>) {
    println(mix(BLUE, VIOLET))
    println(mix(YELLOW, VIOLET))
}
