package lesson_15

fun main() {

    val weatherServer = WeatherServer()

    val temperature1 = Temperature(23)
    val temperature2 = Temperature(-5)
    val precipitationAmount1 = PrecipitationAmount(30)
    val precipitationAmount2 = PrecipitationAmount(60)

    weatherServer.sendMessage(temperature1)
    weatherServer.sendMessage(temperature2)
    weatherServer.sendMessage(precipitationAmount1)
    weatherServer.sendMessage(precipitationAmount2)
}

abstract class WeatherStationStats() {

    abstract val value: Int
}

class Temperature(override val value: Int) : WeatherStationStats()

class PrecipitationAmount(override val value: Int) : WeatherStationStats()

class WeatherServer() {

    fun sendMessage(weatherStationStats: WeatherStationStats) {
        if (weatherStationStats is Temperature) {
            println("Температура: ${weatherStationStats.value}°C")
        } else {
            println("Среднее количество осадков: ${weatherStationStats.value} мм")
        }
    }
}