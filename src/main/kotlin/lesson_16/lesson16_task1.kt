package lesson_16

class Dice() {

    private val number = (1..6).random()

    fun getNumber() {
        println("Выпавшее число: $number")
    }
}