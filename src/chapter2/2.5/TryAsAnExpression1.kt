package chapter2.TryAsAnExpression1

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("Not a number"))
    readNumber(reader)
}

