package chapter4.Modifiers

import chapter4.Main.Focusable

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

/**
 * fun TalkativeButton.giveSpeech() {

yell()

whisper()
}

fun main(args: Array<String>) {

}
 */
