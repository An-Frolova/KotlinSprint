package lesson_14

fun main() {

    val satellite1 = Satellite("LN-328-1", false, true)
    val satellite2 = Satellite("LN-328-2", false, false)
    val planet = Planet("Фрейя", true, true, listOf(satellite1, satellite2))

    with(planet) {
        println("Название: ${name}")
        println("Спутники: ${this.satellites.joinToString(", ") { it.name }}")
    }
}

abstract class CelestialBody(
    val name: String,
    val haveAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    name: String,
    haveAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: List<Satellite>
) : CelestialBody(name, haveAtmosphere, isSuitableForLanding)


class Satellite(
    name: String,
    haveAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : CelestialBody(name, haveAtmosphere, isSuitableForLanding)
