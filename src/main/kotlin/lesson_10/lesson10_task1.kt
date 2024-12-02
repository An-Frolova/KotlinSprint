package lesson_10

fun main() {

    val humanMove = throwDie()
    println("Ход игрока. Выпало число $humanMove")
    val computerMove = throwDie()
    println("Ход компьютера. Выпало число $computerMove")

    if (computerMove > humanMove) {
        println("Победила машина")
    } else if (computerMove < humanMove) {
        println("Победило человечество")
    } else {
        println("Победила дружба")
    }
}

fun throwDie() = (1..6).random()