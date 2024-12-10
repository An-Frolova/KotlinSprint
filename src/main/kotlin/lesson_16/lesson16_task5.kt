package lesson_16

fun main() {

    val player1 = Player("Скорпион", 100, 20)
    player1.takeDamage(15)
    player1.takeDamage(20)
    player1.restoreHealth(10)
    player1.takeDamage(20)
    player1.takeDamage(15)
    player1.restoreHealth(10)
    player1.takeDamage(25)
    player1.takeDamage(30)
    player1.restoreHealth(30)
}

class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int,
) {

    private var isAlive: Boolean = true

    fun restoreHealth(healthPoints: Int) {
        if (isAlive) {
            health += healthPoints
            println("Здоровье +$healthPoints    Шкала здоровья: $health")
        }
    }

    fun takeDamage(damagePoints: Int) {
        if (isAlive) {
            health -= damagePoints
            println("Здоровье -$damagePoints    Шкала здоровья: $health")
            if (health <= 0) {
                die()
            }
        }
    }

    private fun die() {
        health = 0
        attackPower = 0
        isAlive = false
        println("Игрок мертв. Игра окончена")
    }
}