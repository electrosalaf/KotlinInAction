package chapter3.MultilineTriplequotedStrings

val kotlinLogo = """| //
                   .|//
                   .|/ \"""

val price = """${'#'}99.9"""

fun main (args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
    println(price)
}