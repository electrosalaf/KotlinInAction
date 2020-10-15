package chapter4.InnerAndNestedClassesNestedByDefault2

class Outer {
    inner class Inner {
        fun getOutReference() : Outer = this@Outer
    }
}

