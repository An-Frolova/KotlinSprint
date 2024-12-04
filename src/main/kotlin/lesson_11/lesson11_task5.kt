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
        val user = ForumMember.ForumMemberBuilder()
            .setUserId(userId++)
            .setUserName(name)
            .build()
        members.add(user)
        return user
    }

    fun createNewMessage(userId: Int, message: String): ForumMessage? {
        val user = members.find { it.userId == userId }
        return if (user != null) {
            val newMessage = ForumMessage.ForumMessageBuilder()
                .setAuthorId(userId)
                .setMessage(message)
                .build()
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
) {
    class ForumMemberBuilder() {
        var userId: Int = 0
        var userName: String = ""

        fun setUserId(value: Int) = apply { this.userId = value }
        fun setUserName(value: String) = apply { this.userName = value }

        fun build(): ForumMember {
            return ForumMember(userId, userName)
        }
    }
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    class ForumMessageBuilder() {
        var authorId: Int = 0
        var message: String = ""

        fun setAuthorId(value: Int) = apply { this.authorId = value }
        fun setMessage(value: String) = apply { this.message = value }

        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}