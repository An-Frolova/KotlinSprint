package lesson_1_10

var humanWins = 0

fun main() {
    var continueGame: Boolean
    do {
        playRound()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userAnswer = readln().lowercase()
        continueGame = userAnswer == "да"
        if (!continueGame) {
            println("Игра окончена. Количество выигранных партий: $humanWins.")
        }
    } while (continueGame)
}

fun playRound() {
    val humanScore = throwDice()
    println("Ход игрока. Выпало число $humanScore")
    Thread.sleep(1000)
    val computerScore = throwDice()
    println("Ход компьютера. Выпало число $computerScore")
    Thread.sleep(1000)
    countHumanWins(humanScore, computerScore)
}

fun throwDice() = (1..6).random()

fun countHumanWins(humanMove: Int, computerMove: Int) {
    if (humanMove > computerMove) {
        humanWins++
    }
}