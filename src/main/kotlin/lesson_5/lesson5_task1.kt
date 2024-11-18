package lesson_5

import kotlin.random.Random

fun main() {

    val a = Random.nextInt(1,6)
    val b = Random.nextInt(1, 6)
    println("Решите пример:\n$a+$b=")
    val correctAnswer = a+b
    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}