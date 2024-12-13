package lesson_19

fun main() {

    val tank = Tank()
    tank.shoot()
    tank.changeAmmunitionType(Ammunition.GREEN)
    tank.shoot()
    tank.changeAmmunitionType(Ammunition.BLUE)
    tank.shoot()
    tank.changeAmmunitionType(Ammunition.RED)
    tank.shoot()
}

enum class Ammunition(val strength: Int) {

    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {

    private var ammunitionType: Ammunition? = null

    fun changeAmmunitionType(newAmmunition: Ammunition) {
        ammunitionType = newAmmunition
    }

    fun shoot() {
        if (ammunitionType != null) {
            println("Урон ${ammunitionType?.strength}")
        } else {
            println("Урон 0")
        }
    }
}