package chapter3.MakingYourCodeTidyLocalFunctionsAndExtensions3

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validateUser(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName")
        }
    }

    validateUser(name, "Name")
    validateUser(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()

    //Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}
