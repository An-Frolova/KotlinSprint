package lesson_8

fun main() {

    println("Введите количество ингредиентов")
    val count = readln().toInt()
    val arrayOfIngredients = arrayOfNulls<String>(count)
    for (ingredient in 0..<count) {
        println("Введите название ингредиента ${ingredient + 1}")
        val userElement = readln()
        arrayOfIngredients[ingredient] = userElement
    }
    println("Ингредиенты: ${arrayOfIngredients.joinToString(", ")}")
}