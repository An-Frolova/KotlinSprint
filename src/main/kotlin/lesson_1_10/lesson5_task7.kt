package lesson_1_10

fun main() {

    println("Введите расстояние, которое вы собираетесь преодолеть (км)")
    val distance = readln().toFloat()
    println("Введите расход топлива на 100 км (л)")
    val fuelUsagePer100Km = readln().toFloat()
    println("Введите цену за литр топлива")
    val pricePerLiter = readln().toFloat()

    val fuelForTrip = distance * fuelUsagePer100Km / 100
    val fuelPriceForTrip = fuelUsagePer100Km * pricePerLiter

    println(
        "Для поездки вам понадобится ${String.format("%.2f", fuelForTrip)} топлива." +
                "Общая цена за топливо - ${String.format("%.2f", fuelPriceForTrip)}"
    )
}