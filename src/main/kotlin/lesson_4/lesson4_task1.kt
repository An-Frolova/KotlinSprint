package lesson_4

fun main() {

    val bookedForToday = 13
    val bookedForTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${bookedForToday < COUNT_OF_TABLES}\n" +
        "Доступность столиков на завтра: ${bookedForTomorrow < COUNT_OF_TABLES}"
    )
}

const val COUNT_OF_TABLES = 13