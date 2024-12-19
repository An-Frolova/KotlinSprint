package lesson_21


class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}