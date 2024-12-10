package lesson_17

fun main() {

    val ship = Ship()
    ship.name = "Черная жемчужина"
}

class Ship() {

    private var _name = "Надежда"
    private var _speed = 50
    private var _seaport = "Кейптаун"

    var name = _name
        set(value) {
            println("Имя корабля изменить нельзя!")
        }
}