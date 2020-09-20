package chapter2.SmartCastsCombiningTypeChecksAndCasts

interface Expr
class Num(val value: Int): Expr        //Use colon: after a class that implements an interface
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval((e.left))
    }
    throw IllegalArgumentException("Unknown Expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
