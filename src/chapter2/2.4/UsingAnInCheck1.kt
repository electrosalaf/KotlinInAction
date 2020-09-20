package chapter2.UsingAnInCheck1

fun recoqnize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know"
}

fun main(args: Array<String>) {
    println(recoqnize('8'))
    println(recoqnize('Z'))
    println("Kotlin" in "Angular".."Scala")
    println("Zamarin" in "Python".."Ruby")
    println("Kotlin" in setOf("Java", "Scala"))
}

