package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    val token = login(login, password)
    if (token != null) {
        val shoppingList = getCart(token)
        println("Товары в корзине: ${shoppingList.joinToString()}")
    } else {
        println("Неверный логин или пароль")
    }
}

fun login(login: String, password: String): String? {
    return if (login == LOGIN && password == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String): MutableList<String> {
    return mutableListOf("Перчатки", "Шарф", "Ободок для волос", "Рубашка", "Брелок", "Серьги")
}

fun generateToken(): String {
    val tokenAsList = mutableListOf<Char>()
    val listOfRanges = ('0'.code..'9'.code) + ('a'.code..'z'.code) + ('A'.code..'Z'.code)
    for (i in 1..TOKEN_SIZE) {
        val char = listOfRanges.random().toChar()
        tokenAsList.add(char)
    }
    return tokenAsList.joinToString("")
}

const val LOGIN = "some_login"
const val PASSWORD = "123456"
const val TOKEN_SIZE = 32