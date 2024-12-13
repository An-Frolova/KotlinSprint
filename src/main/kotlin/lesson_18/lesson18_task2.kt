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

    abstract val facesCount: Int

    open fun throwDice() {
        println((1..facesCount).random())
    }
}

class Dice4Faces() : Dice() {

    override val facesCount: Int = 4
}

class Dice6Faces() : Dice() {

    override val facesCount: Int = 6
}

class Dice8Faces() : Dice() {

    override val facesCount: Int = 8
}