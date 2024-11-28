package lesson_7

fun main() {

    println("Введите число, которое будет соответсвовать количеству символов в пароле")
    var charNumber = readln().toInt()
    while (charNumber < MIN_LENGTH_OF_PASSWORD) {
        println("Минимальное количество символов - $MIN_LENGTH_OF_PASSWORD")
        charNumber = readln().toInt()
    }

    val rangesOfChars = (0..9) + ('a'..'z') + ('A'..'Z')

    for (i in 1..charNumber) {
        val randomChar = rangesOfChars.random()
        print("$randomChar")
    }
}

const val MIN_LENGTH_OF_PASSWORD = 6