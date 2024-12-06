package lesson_14

fun main() {
    val ship = Ship()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()
    val liner = Liner()
}

open class Ship(
    val speed: Int = 50,
    val capacity: Int = 100,
    val canBreakIce: Boolean = false,
)

class CargoShip() : Ship(speed = 40, capacity = 500)

class Icebreaker() : Ship(speed = 25, capacity = 40, canBreakIce = true)

class Liner() : Ship(capacity = 1000)