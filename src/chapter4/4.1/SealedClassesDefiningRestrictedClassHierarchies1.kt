package chapter4.SealedClassesDefiningRestrictedClassHierarchies1

sealed class Expr {                                              // Mark a base class as sealed

    class Num(val value: Int) : Expr()                           //  List all subclasses as nested classes
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr) : Int =
    when (e) {                                                  // "when" expression covers all cases, no need for "else"
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }



