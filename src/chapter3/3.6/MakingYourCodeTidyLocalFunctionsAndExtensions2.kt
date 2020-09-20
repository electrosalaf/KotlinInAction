package chapter3.MakingYourCodeTidyLocalFunctionsAndExtensions2

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    fun validateUser(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: " + "empty $fieldName")
        }
    }

    validateUser(user.name, "Name")
    validateUser(user.address, "Address")

    //  Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "Adewale", "King's Palace, Ago"))
}
