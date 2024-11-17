package lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffInPercentage = 20

    val buffForCalculations = buffInPercentage * AS_DECIMAL_FRACTION
    val crystalOreBonus = (crystalOre * buffForCalculations).toInt()
    val ironOreBonus = (ironOre * buffForCalculations).toInt()

    println("кристаллическая руда +$crystalOreBonus")
    println("железная руда +$ironOreBonus")
}

const val AS_DECIMAL_FRACTION = 0.01