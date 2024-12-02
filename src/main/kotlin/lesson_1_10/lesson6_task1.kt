package lesson_1_10

fun main() {

    var isAuthorized = false

    println("Придумайте логин")
    val login = readln().trim()
    println("Придумайте пароль")
    val password = readln().trim()

    while (!isAuthorized) {
        println("Введите логин")
        val inputLogin = readln().trim()
        println("Введите пароль")
        val inputPassword = readln().trim()
        if (inputLogin == login && inputPassword == password) {
            println("Авторизация прошла успешно")
            isAuthorized = true
        }
    }
}