package lesson_20

fun main() {

    val openDoor = { hero: Hero -> if (hero.haveKey) "Игрок открыл дверь" else "Дверь заперта" }

    val hero = Hero()
    hero.haveKey = true
    println(openDoor(hero))
}

class Hero() {
    var haveKey: Boolean = false
}