package lesson_1_10

fun main() {

    val listOfIngredients =
        mutableListOf("тунец консервированный", "яйца", "маслины", "салатный лист", "лук", "помидоры", "соль")

    println("В рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}")

    listOfIngredients.forEach { ingredient: String ->
        println(ingredient)
    }
}