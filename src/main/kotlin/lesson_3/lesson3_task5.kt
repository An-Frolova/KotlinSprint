package lesson_3

fun main() {

    val str = "D2-D4;0"

    val parts = str.split(";")
    val part1 = parts[0]
    val moveNumber = parts[1].toInt()

    val move = part1.split("-")
    val moveFrom = move[0]
    val moveTo = move[1]

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}