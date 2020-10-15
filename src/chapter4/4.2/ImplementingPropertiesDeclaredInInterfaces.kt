package chapter4.ImplementingPropertiesDeclaredInInterfaces

fun getFacebookName(accountId: Int) = "fb:$accountId"

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User                             //  Primary constructor property

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')                                //    Custom getter
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)                            //    Property initializer
}

fun main(args: Array<String>) {
    println(PrivateUser("test@Kotlinlang.org").nickname)
    println(SubscribingUser("test@Kotlinlang.org").nickname)
}