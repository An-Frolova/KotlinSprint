package lesson_15

fun main() {

    val user = User("Lune", 10)
    user.readForum()
    user.writeMessage()

    val administrator = Administrator("Main Administrator", 1)
    administrator.readForum()
    administrator.writeMessage()
    administrator.deleteMessage()
    administrator.deleteUser()
}

abstract class BaseUser() {

    abstract val name: String
    abstract val id: Int

    abstract fun readForum()
    abstract fun writeMessage()
}

class User(
    override val name: String,
    override val id: Int
) : BaseUser() {

    override fun readForum() {
        println("Пользователь читает форум")
    }

    override fun writeMessage() {
        println("Пользователь написал сообщение")
    }
}

class Administrator(
    override val name: String,
    override val id: Int
) : BaseUser() {

    override fun readForum() {
        println("Администратор читает форум")
    }

    override fun writeMessage() {
        println("Администратор написал сообщение")
    }

    fun deleteMessage() {
        println("Администратор удалил сообщение")
    }

    fun deleteUser() {
        println("Администратор удалил пользователя")
    }
}