package lesson_12

fun main() {
    val weather = DailyWeather(300, 295, true)
    weather.printInfo()
}

class DailyWeather(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    _isRaining: Boolean
) {
    private val dayTemperatureInCelsius = (dayTemperatureInKelvin + KELVIN_ZERO).toInt()
    private val nightTemperatureInCelsius = (nightTemperatureInKelvin + KELVIN_ZERO).toInt()
    private val isRaining = _isRaining

    fun printInfo() {
        println(
            """
            Дневная температура: $dayTemperatureInCelsius
            Ночная температура: $nightTemperatureInCelsius
            Осадки в течение суток: ${if (isRaining) "да" else "нет"}
        """.trimIndent()
        )
    }
}

const val KELVIN_ZERO = -273.15