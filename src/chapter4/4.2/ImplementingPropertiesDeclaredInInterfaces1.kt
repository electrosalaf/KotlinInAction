package chapter4.ImplementingPropertiesDeclaredInInterfaces1

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')     //  This property does not have a backing field: the result value is computed on each access
}