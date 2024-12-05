package lesson_14

fun main() {

    val ship = Ship2()
    val cargoShip = CargoShip2()
    val icebreaker = Icebreaker2()
    val liner = Liner2()

    ship.printInfo()
    cargoShip.printInfo()
    icebreaker.printInfo()
    liner.printInfo()
}

open class Ship2(
    val speed: Int = 50,
    val capacity: Int = 100,
    val canBreakIce: Boolean = false,
) {
    open fun startLoading() {
        println("Погрузка началась")
    }

    fun printInfo() {
        println(
            """
            Скорость: $speed
            Вместимость: $capacity
            Корабль может колоть лед: ${if (canBreakIce) "да" else "нет"}
        """.trimIndent()
        )
    }
}

class CargoShip2() : Ship2(speed = 40, capacity = 500) {

    override fun startLoading() {
        println("Погрузочный кран активирован")
    }
}

class Icebreaker2() : Ship2(speed = 25, capacity = 40, canBreakIce = true) {

    override fun startLoading() {
        println("Открыты ворота со стороны кормы")
    }
}

class Liner2() : Ship2(capacity = 1000) {

    override fun startLoading() {
        println("Выдвинут горизонтальный трап со шкафута")
    }
}