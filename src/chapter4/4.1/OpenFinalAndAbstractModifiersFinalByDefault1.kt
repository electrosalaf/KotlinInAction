package chapter4.OpenFinalAndAbstractModifiersFinalByDefault1

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {
    final override fun click() {}
}