package lesson_10


fun main() {

    println("Введите логин")
    val login = readLine()
    println("Введите пароль")
    val password = readLine()
    if (isDataValid(login, password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isDataValid(login: String?, password: String?): Boolean {
    return login?.length!! >= 4 && password?.length!! >= 4
}