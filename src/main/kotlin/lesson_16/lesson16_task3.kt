package lesson_16

fun main() {

    val user = User()
    if (user.isPasswordValid("1234")) {
        println("Пароль указан верно")
    }
}

class User() {

    val login = "login"
    private val password = "1234"

    fun isPasswordValid(password: String): Boolean = this.password == password
}