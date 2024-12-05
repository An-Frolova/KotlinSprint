package lesson_11

fun main() {

    val forum = Forum()
    val user1 = forum.createNewUser("Николай")
    val user2 = forum.createNewUser("Анастасия")
    forum.createNewMessage(user1.userId, "Сообщение от первого участника.")
    forum.createNewMessage(user2.userId, "Сообщение от второго участника.")
    forum.createNewMessage(user1.userId, "Еще одно сообщение от первого участника.")
    forum.createNewMessage(user2.userId, "Еще одно сообщение от второго участника.")
    forum.printThread()
}

class Forum() {

    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var userId = 1

    fun createNewUser(name: String): ForumMember {
        val user = ForumMember(userId++, name)
        members.add(user)
        return user
    }

    fun createNewMessage(userId: Int, message: String): ForumMessage? {
        val user = members.find { it.userId == userId }
        return if (user != null) {
            val newMessage = ForumMessage(userId, message)
            messages.add(newMessage)
            newMessage
        } else {
            println("Пользователь с ID $userId не найден")
            null
        }
    }

    fun printThread() {
        for (i in 0..<messages.size) {
            val user = members.find { it.userId == messages[i].authorId }
            println("${user?.userName}: ${messages[i].message}")
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)