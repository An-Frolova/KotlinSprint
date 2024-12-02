package lesson_1_10

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()
    Thread.sleep(seconds * AS_MILLISECONDS)
    println("Прошло $seconds секунд")
}

const val AS_MILLISECONDS = 1000L