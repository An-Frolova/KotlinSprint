package lesson_10

var humanWins = 0

fun main() {
    var continueGame = true
    playRound()
    while (continueGame) {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userAnswer = readln().lowercase().replaceFirstChar { it.uppercaseChar() }
        if (userAnswer == "Да") {
            playRound()
        } else {
            println("Игра окончена. Количество выигранных партий: $humanWins.")
            continueGame = false
        }
    }
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