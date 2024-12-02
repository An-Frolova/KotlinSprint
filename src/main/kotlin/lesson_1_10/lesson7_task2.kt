package lesson_1_10

fun main() {

    var isAuthorized = false

    while (!isAuthorized) {
        val password = (1000..9999).random()
        println("Ваш код авторизации: $password")
        println("Введите код:")
        val input = readln().toInt()
        if (input != password) {
            println("Неверный код. Попробуйте снова.")
        } else {
            println("Добро пожаловать!")
            isAuthorized = true
        }
    }
}