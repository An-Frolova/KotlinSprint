package lesson_1_10

fun main() {

    println("Введите количество секунд, которое необходимо засечь")
    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        if (i == 0) {
            println("Время вышло")
        } else {
            println(i)
            Thread.sleep(1000)
        }
    }
}