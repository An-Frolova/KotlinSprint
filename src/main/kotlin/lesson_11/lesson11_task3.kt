package lesson_11


fun main() {

    val user1 = User3(
        id = 1,
        name = "Ирина К",
        avatarUrl = null,
        status = UserStatus.MICROPHONE_OFF,
    )

    val user2 = User3(
        id = 2,
        name = "Алёна И",
        avatarUrl = null,
        status = UserStatus.MUTED,
    )

    val user3 = User3(
        id = 3,
        name = "Михаил Н",
        avatarUrl = null,
        status = UserStatus.TALKING,
    )

    val room = Room(
        backgroundImageUrl = "",
        name = "Сериалы",
        members = mutableListOf(user1, user2)
    )

    room.changeUserStatus("Ирина К", UserStatus.TALKING)
    room.addNewMember(user3)
}

class Room(
    val backgroundImageUrl: String,
    val name: String,
    val members: MutableList<User3>
) {

    fun addNewMember(user: User3) {
        members.add(user)
    }

    fun changeUserStatus(userName: String, newStatus: UserStatus) {
        val user = members.find { it.name == userName }
        if (user != null) {
            user.status = newStatus
        }
    }
}

class User3(
    val id: Int,
    val name: String,
    val avatarUrl: String?,
    var status: UserStatus,
)

enum class UserStatus(status: String) {
    TALKING("разговаривает"),
    MICROPHONE_OFF("микрофон выключен"),
    MUTED("пользователь заглушен")
}

