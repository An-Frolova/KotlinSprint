package lesson_17

fun main() {

    val ship = Ship("Надежда", 50, "Кейптаун")
    ship.name = "Черная жемчужина"
    println(ship.name)
}

class Ship(
    shipName: String,
    var speed: Int,
    var seaport: String,
) {

    var name = shipName
        set(value) {
            println("Имя корабля изменить нельзя!")
        }
}