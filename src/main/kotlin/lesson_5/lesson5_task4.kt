package lesson_5

fun main() {

    println("Пожалуйста, вводите свои данные...")

    val userName = readln()

    if (userName != USER_NAME) {
        println("Пользователь с таким именем не найден. Зарегестрируйтесь для входа в систему")
        return
    } else {
        println("Введите пароль:")
        val userPassword = readln()
        if (userPassword == USER_PASSWORD) {
            println("Ваши данные проверены, и о, чудо, они верны... ")
        }
    }
}

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"