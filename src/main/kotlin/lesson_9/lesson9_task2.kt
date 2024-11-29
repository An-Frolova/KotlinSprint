package lesson_9

fun main() {

    val listOfIngredients = mutableListOf("куриное филе", "картофель", "морковь")
    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString(", ")}")
    println("Желаете добавить еще?")
    val userAnswer = readln()
    if (userAnswer.equals("нет")) {
        return
    } else if (userAnswer.equals("да")) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln().lowercase()
        listOfIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}")
    }
}