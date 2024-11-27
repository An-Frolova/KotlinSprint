package lesson_7

fun main() {

    println("Введите любое число")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2) {
        print("$i ")
    }
}