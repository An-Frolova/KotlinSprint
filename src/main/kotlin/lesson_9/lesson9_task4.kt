package lesson_9

fun main() {

    println("Введите 5 ингредиентов через запятую")
    val input = readln()
    val ingredients = input.split(", ").sorted()
    println(ingredients)
}