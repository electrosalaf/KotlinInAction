package chapter3.ParsePathUsingRegularExpression


fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main (args: Array<String>) {
    parsePath("/Users/Electrosalaf/KotlinInAction/Chapter3.pdf")
}