package chapter4.InitializingClassesPrimaryConstructorAndInitializerBlocks

class User constructor(_nickname: String) {             // Primary constructor with one parameter
    val nickname : String

    init {                                              // Initializer block
        nickname = _nickname
    }
}
