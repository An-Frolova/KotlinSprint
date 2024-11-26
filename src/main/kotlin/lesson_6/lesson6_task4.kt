package lesson_6

fun main() {

    val number = (1..9).random()
    var numberOfTries = 5

    println("Я загадал число от 1 до 9. Угадай, какое?")

    while (numberOfTries > 0) {
        val input = readln().toInt()
        if (input == number) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно! Оставшееся количество попыток: ${--numberOfTries}")
            if (numberOfTries == 0) {
                println("Было загадано число $number")
            }
        }
    }
}