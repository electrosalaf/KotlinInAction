package chapter3.MakingYourCodeTidyLocalFunctionsAndExtensions1

class User(val id: Int, val name: String, val address: String)

fun saveUser(user:User) {

    fun validateUser(user: User,
                     value: String,
                     fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException (
                "Cannot save user ${user.id}: $fieldName is empty")
        }
    }

    validateUser(user, user.name, "Name")
    validateUser(user, user.address, "Address")

    //  Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}

