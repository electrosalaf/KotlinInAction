package chapter2.EvalIf

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    }
    else throw IllegalArgumentException("Oops, Unknown expression")

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    println("The answer is:  ${eval(Sum(Num(1), Num(2)))}")
}

