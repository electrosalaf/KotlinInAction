package chapter4.ClassDelegationUsingTheByKeyword

class CountingSet<T> (
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {                      //  Delegate the MutableCollection implementation to innerSet...

    var objectAdded = 0

    override fun add(element: T): Boolean {                //   Does not delegate; provides a different implementation...
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1,1,2))
    println("${cset.objectAdded} objects were added, ${cset.size} remain")
}


