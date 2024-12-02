package lesson_11

fun main() {

    val user1 = User(1, "some_login", "password", "user1@gmail.com")
    val user2 = User(2, "user2_login", "1234", "user2@gmail.com")
    println(
        """
        Информация о первом пользователе:
        id - ${user1.id}
        login - ${user1.login}
        password - ${user1.password}
        email - ${user1.email}
        
    """.trimIndent())

    println ("""
        Информация о втором пользователе:
        id - ${user2.id}
        login - ${user2.login}
        password - ${user2.password}
        email - ${user2.email}
    """.trimIndent())
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)