package chapter2.SmartCastsCombiningTypeChecksAndCasts2

interface Expr
class Num(val value: Int): Expr
class Product(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Product) {
        return eval(e.left) * eval(e.right)
    }
    throw IllegalArgumentException("Oops, Unknown expression!!!")
}

fun main(args: Array<String>) {
    println(eval(Product(Product(Num(5), Num(5)), Num(5))))
}

