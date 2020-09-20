package chapter3.SplittingStrings

fun main(args: Array<String>) {
    println("12.356-6.A".split("\\.|-".toRegex()))
    println("12.356-6.A".split(".", "-"))   //  Without using the regex.........
}

