package chapter4.AccessingABackingFieldFromAGetterOrSetter

class User(val name: String) {
    var address: String = "unspecified"
        set (value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())                          //  Reads the backing field value

            field = value                                                      //   Updates the backing field value
        }
}

fun main(args: Array<String>) {
    val user = User("Oke Francis Oyebanji")
    user.address = "Ontario Area, Canada"
}
