package chapter3.NoOverridingForExtensionFunctions1

open class View {
    open fun click() = println("View click")
}

class Button: View() {
    override fun click() = println("Button click")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button")

fun main (args: Array<String>) {
    val view: View = Button()
    view.showOff()
}