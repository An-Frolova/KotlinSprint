package lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val distanceFromEarthInLightYears: Double,
    val time: LocalDateTime? = null,
)

fun main() {

    val galacticGuide = GalacticGuide(
        "Alpha Centauri",
        "Тройная звёздная система в созвездии Центавра.",
        4.37,
    )

    println(galacticGuide.component1())
    println(galacticGuide.component2())
    println(galacticGuide.component3())
}