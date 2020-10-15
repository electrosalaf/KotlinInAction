package chapter4.OpenFinalAndAbstractModifiersFinalByDefault2



abstract class Animated {       //  This class is abstract: you can't create an instance of this class

    abstract fun animate()      // This function is abstract: it doesn't have an implementation and must be overridden

    open fun stopAnimating() {  // Non-abstract functions is abstract classes aren't open by default but can be marked as open
    }

    fun animateTwice() {}
}