package chapter4.OpenFinalAndAbstractModifiersFinalByDefault

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {             //  This class is open, others can inherit from it

    fun disable() {}                            // This function is "final": you can't override it in a subclass

    open fun animate() {}                       // This function is "open": you may override it in a subclass

    override fun click() {}                    //   This function overrides an open function and is open as well
}