package lesson_20

fun main() {

    val recoverHealth: (player: Player) -> Unit = { player -> player.currentHealth = player.maxHealth }

    val player = Player("Геральт", 30, 100)
    recoverHealth(player)
    println("Текущее здоровье: ${player.currentHealth}")
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) 