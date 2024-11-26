package lesson_6

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()
    var count = seconds

    while (count > 0) {
        println(count--)
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд")
}