package lesson_1_10

fun main() {

    val winNumbers = listOf((0..42).random(), (0..42).random(), (0..42).random())
    val userNumbers = mutableListOf<Int>()

    println("Введите первое число от 0 до 42")
    userNumbers.add(readln().toInt())
    println("Введите второе число от 0 до 42")
    userNumbers.add(readln().toInt())
    println("Введите третье число от 0 до 42")
    userNumbers.add(readln().toInt())

    val intersection = winNumbers.intersect(userNumbers).size

    when (intersection) {
        3 -> println("Поздравляем! Вы отгадали 3 числа и выиграли джекпот!")
        2 -> println("Вы отгадали 2 числа и выиграли крупный приз!")
        1 -> println("Вы отгадали 1 число и выиграли утешительный приз!")
        else -> println("К сожалению, вы не угадали ни одно число.")
    }

    println("Выигрышные числа: ${winNumbers.joinToString(", ")}")
}