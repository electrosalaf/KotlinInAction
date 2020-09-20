package chapter2.UsingWhenWithoutAnArgument

import chapter2.colors.Color
import chapter2.colors.Color.*

/*  If no argument is supplied for when expression, each branch condition is a boolean expression  */
fun mixOptimized (c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO

        else -> throw Exception("Oops, dirty color!!!")
}

fun main (args: Array<String>) {
    println(mixOptimized(BLUE, YELLOW))
}

