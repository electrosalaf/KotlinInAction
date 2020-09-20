package chapter3.NoOverridingForExtensionFunctions

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main (args: Array<String>) {
    val view: View = Button()
    view.click()

}