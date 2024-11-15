package lesson_3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    println("$moveFrom, $moveTo; ${moveNumber++}")

    moveFrom = "D2"
    moveTo = "D3"
    println("$moveFrom, $moveTo; ${moveNumber}")
}