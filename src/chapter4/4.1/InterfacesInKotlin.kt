package chapter4.InterfacesInKotlin

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() = println("I was clicked!!!")
}

fun main(args: Array<String>) {
    Button().click()
}