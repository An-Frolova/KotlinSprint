package lesson_1_10

import java.time.LocalDate

fun main() {

    println("Введите год Вашего рождения")
    val userInput = readln().toInt()
    val userAge = LocalDate.now().year - userInput

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться на главный экран"
    }
    println(resultText)
}

const val AGE_OF_MAJORITY = 18