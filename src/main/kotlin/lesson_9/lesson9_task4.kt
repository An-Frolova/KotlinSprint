package lesson_9

fun main() {

    println("Введите 5 ингредиентов через запятую")
    val input = readln()
    val ingredients = input.split(", ").toMutableList()
    val ingredientsSorted = ingredients.sorted()
    println(ingredientsSorted)
}