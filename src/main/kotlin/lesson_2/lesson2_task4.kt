package lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val buff = 0.2f

    val crystalOreBonus = (crystalOre * buff).toInt()
    val ironOreBonus = (ironOre * buff).toInt()

    println("кристаллическая руда +$crystalOreBonus")
    println("железная руда +$ironOreBonus")
}