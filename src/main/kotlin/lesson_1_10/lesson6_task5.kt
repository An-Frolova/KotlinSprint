package lesson_1_10

fun main() {

    var attempts = 3

    println("Решите пример")

    while (attempts > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        val correctAnswer = number1 + number2
        println("$number1 + $number2 =")
        val input = readln().toInt()
        if (input == correctAnswer) {
            println("Добро пожаловать!")
            return
        } else {
            attempts--
            if (attempts > 0) {
                println("Ответ неверный. Осталось попыток: $attempts")
            }
        }
    }
    println("Доступ запрещен")
}