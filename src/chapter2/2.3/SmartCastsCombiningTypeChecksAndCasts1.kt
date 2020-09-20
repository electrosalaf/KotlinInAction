package chapter2.SmartCastsCombiningTypeChecksAndCasts1

interface Expr
class Num(val value: Int): Expr
class Div(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Div) {
        return eval(e.left) / eval(e.right)
    }
    throw IllegalArgumentException("Oops, Unknown expression!!!")
}

fun main(args: Array<String>) {
    println(eval(Div(Div(Num(100), Num(10)), Num(5))))
}