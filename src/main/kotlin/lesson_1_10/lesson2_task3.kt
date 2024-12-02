package lesson_1_10

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val travelTime = 457

    val departureTimeInMinutes = departureHours * 60 + departureMinutes
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime

    val arrivalHours = arrivalTimeInMinutes / 60
    val arrivalMinutes = arrivalTimeInMinutes - arrivalHours * 60

    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")
}