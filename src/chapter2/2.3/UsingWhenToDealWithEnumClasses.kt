package chapter2.UsingWhenToDealWithEnumClasses

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic (color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

/*Putting multiple values in one branch and separating by a comma*/
fun getWarmth (color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Warm"
        Color.GREEN -> "Neutral"
        Color.BLUE, Color.VIOLET, Color.INDIGO -> "Cold"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
}

