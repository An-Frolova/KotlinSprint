package lesson_17

fun main() {

    val ship = Ship("Надежда", 50, "Кейптаун")
    ship.name = "Черная жемчужина"
}

class Ship(
    private var shipName: String,
    private var speed: Int,
    private var seaport: String,
) {

    var name = shipName
        set(value) {
            println("Имя корабля изменить нельзя!")
        }
}