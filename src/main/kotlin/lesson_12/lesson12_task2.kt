package lesson_12

fun main() {

    val weather1 = WeatherInOneDay(13, 5, true)
    weather1.printInfo()
}

class WeatherInOneDay(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isRaining: Boolean
) {

    fun printInfo() {
        println(
            """
            Дневная температура: $dayTemperature
            Ночная температура: $nightTemperature
            Осадки в течение суток: ${if (isRaining) "да" else "нет"}
        """.trimIndent()
        )
    }
}