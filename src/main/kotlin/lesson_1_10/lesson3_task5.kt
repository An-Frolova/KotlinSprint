package lesson_1_10

fun main() {

    val str = "D2-D4;0"

    val parts = str.split('-', ';')
    val moveFrom = parts[0]
    val moveTo = parts[1]
    val moveNumber = parts[2]

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}