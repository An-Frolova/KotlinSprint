package lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffInPercentage = 20

    val buffForCalculations = buffInPercentage * 0.01
    val crystalOreBonus = (crystalOre * buffForCalculations).toInt()
    val ironOreBonus = (ironOre * buffForCalculations).toInt()

    println("кристаллическая руда +$crystalOreBonus")
    println("железная руда +$ironOreBonus")
}