package lesson_11

fun main() {

    val user = User2(1, "login", "my_password", "user@mail.ru")
    user.addUserBio()
    user.changePassword()
    user.printInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "null",
) {

    fun printInfo() {
        println(
            """
            Данные о пользователе:
            id: $id
            логин: $login
            пароль: $password
            почта: $email
            биография: $bio
        """.trimIndent()
        )
    }

    fun addUserBio() {
        println("Расскажите о себе:")
        val input = readln()
        bio = input
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val oldPassword = readln()
        if (oldPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль был изменен")
        } else {
            println("Ошибка! Неверный пароль!")
        }
    }
}