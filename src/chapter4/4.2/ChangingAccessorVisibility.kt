package chapter4.ChangingAccessorVisibility

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi, this is me getting better at Kotlin!!!")
    println(lengthCounter.counter)
}