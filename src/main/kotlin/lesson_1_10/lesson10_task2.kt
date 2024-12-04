package lesson_1_10


fun main() {

    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()
    if (isDataValid(login, password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isDataValid(login: String, password: String): Boolean {
    return login.length >= MIN_LENGTH && password.length >= MIN_LENGTH
}

const val MIN_LENGTH = 4