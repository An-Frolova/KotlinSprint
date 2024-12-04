package lesson_12

fun main() {

    val weatherJune8 = Weather()
    weatherJune8.dayTemperature = 25
    weatherJune8.nightTemperature = 18
    weatherJune8.isRaining = true

    val weatherMarch12 = Weather()
    weatherMarch12.dayTemperature = 10
    weatherMarch12.nightTemperature = 4
    weatherMarch12.isRaining = false

    println("Погода 8 Июня")
    weatherJune8.printInfo()
    println()
    println("Погода 12 Марта")
    weatherMarch12.printInfo()
}

class Weather {
    var dayTemperature = 0
    var nightTemperature = 0
    var isRaining = false

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