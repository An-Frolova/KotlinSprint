package lesson_1_10

import kotlin.random.Random

fun main() {

    val winNumber1 = Random.nextInt(0, 43)
    val winNumber2 = Random.nextInt(0, 43)

    println("Введите первое число от 0 до 42")
    val userNumber1 = readln().toInt()
    println("Введите второе число от 0 до 42")
    val userNumber2 = readln().toInt()

    val resultText = if (
        (userNumber1 == winNumber1 || userNumber1 == winNumber2)
        && (userNumber2 == winNumber1 || userNumber2 == winNumber2)
    ) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if (
        userNumber1 == winNumber1 || userNumber1 == winNumber2 ||
        userNumber2 == winNumber1 || userNumber2 == winNumber2
    ) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }

    println(resultText)
    println("Загаданные числа: $winNumber1 и $winNumber2")
}