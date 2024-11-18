package lesson_4

fun main() {

    val isSunny = true
    val openAwning = true
    val humidity = 20
    val season = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${isSunny == IS_SUNNY && openAwning == OPEN_AWNING && humidity == HUMIDITY && season == SEASON}"
    )
}

const val IS_SUNNY = true
const val OPEN_AWNING = true
const val HUMIDITY = 20
const val SEASON = "not winter"