package lesson_17

fun main() {

    val user = User("James", 23, "login", "12345")

    user.password = "newPassword"
    println(user.password)

    user.login = "new_login"
    println(user.login)
}

class User(
    val name: String,
    val age: Int,
    userLogin: String,
    userPassword: String,
) {

    var login = userLogin
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var password = userPassword
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() = "*".repeat(field.length)
}