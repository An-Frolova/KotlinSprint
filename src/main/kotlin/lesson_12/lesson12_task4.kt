package lesson_12

fun main() {
    val weather = DayWeather(270, 262, true)
}

class DayWeather(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    isRainingInKelvin: Boolean
) {
    private val dayTemperatureInCelsius = (dayTemperatureInKelvin + ABSOLUTE_ZERO_IN_KELVIN).toInt()
    private val nightTemperatureInCelsius = (nightTemperatureInKelvin + ABSOLUTE_ZERO_IN_KELVIN).toInt()
    private val isRaining = isRainingInKelvin

    init {
        println(
            """
            Дневная температура: $dayTemperatureInCelsius
            Ночная температура: $nightTemperatureInCelsius
            Осадки в течение суток: ${if (isRaining) "да" else "нет"}
        """.trimIndent()
        )
    }
}

const val ABSOLUTE_ZERO_IN_KELVIN = -273.15