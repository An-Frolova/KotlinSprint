package lesson_18

fun main() {

    val dice4Faces = Dice4Faces()
    val dice6Faces = Dice6Faces()
    val dice8Faces = Dice8Faces()

    val list: List<Dice> = listOf(dice4Faces, dice6Faces, dice8Faces)
    for (dice in list) {
        dice.throwDice()
    }
}

abstract class Dice() {

    open fun throwDice() {}
}

class Dice4Faces() : Dice() {

    override fun throwDice() {
        println((1..4).random())
    }
}

class Dice6Faces() : Dice() {

    override fun throwDice() {
        println((1..6).random())
    }
}

class Dice8Faces() : Dice() {

    override fun throwDice() {
        println((1..8).random())
    }
}