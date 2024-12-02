package lesson_1_10

fun main() {

    val a = (1..10).random()
    val b = (1..10).random()
    println("Решите пример:\n$a+$b=")
    val correctAnswer = a + b
    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}