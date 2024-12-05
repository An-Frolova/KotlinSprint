package lesson_12

import kotlin.random.Random

fun main() {

    val monthTemperature = mutableListOf<WeatherAnalysis>()
    val dayTemperatureRange = 18..29
    val nightTemperatureRange = 14..18

    for (i in 1..30) {
        val dailyWeather = WeatherAnalysis(
            dayTemperatureRange.random(),
            nightTemperatureRange.random(),
            isRaining = Random.nextBoolean()
        )
        monthTemperature.add(dailyWeather)
    }

    val daytimeTemperature = monthTemperature.map { it.dayTemperature }
    val nightTemperature = monthTemperature.map { it.nightTemperature }
    val countOfRainyDays = monthTemperature.count { it.isRaining }

    println("Средняя дневная температура: ${daytimeTemperature.average().toInt()}")
    println("Средняя ночная температура: ${nightTemperature.average().toInt()}")
    println("Количество дождливых дней: $countOfRainyDays")
}

class WeatherAnalysis(
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