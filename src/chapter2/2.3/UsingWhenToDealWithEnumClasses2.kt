package chapter2.UsingWhenToDealWithEnumClasses2

import chapter2.colors.Color        /*  Imports the Color class declared in another package */
import chapter2.colors.Color.*      /*  Explicitly import enum constants to use them by name */

/*  Simply using imported constants by name*/
fun getWarmth(color: Color) =
    when (color) {
        RED, ORANGE, YELLOW -> "Warm"
        GREEN -> "Neutral"
        BLUE, INDIGO, VIOLET -> "Cold"
    }