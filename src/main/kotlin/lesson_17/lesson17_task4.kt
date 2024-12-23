package lesson_17

fun main() {

    val parcel = Parcel(3, "Склад магазина")
    parcel.location = "Сортировочный пункт"
    println("Новое местоположение: ${parcel.location}")
    parcel.location = "Отделение почты №2"
    println("Новое местоположение: ${parcel.location}")
}

class Parcel(
    val number: Int,
    parcelLocation: String,
) {

    private var movementCount = 0

    var location = parcelLocation
        set(value) {
            field = value
            ++movementCount
            println("Счетчик перемещений = $movementCount")
        }
}