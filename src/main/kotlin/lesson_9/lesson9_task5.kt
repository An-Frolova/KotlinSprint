package lesson_9

fun main() {

    val ingredients = mutableSetOf<String>()
    for (i in 1..NUMBER_OF_INGREDIENTS) {
        println("Введите ингредиент №$i")
        var ingredient = readln().lowercase()
        while (ingredient in ingredients) {
            println("Ингредиент $ingredient уже добавлен. Введите другой")
            ingredient = readln().lowercase()
        }
        ingredients.add(ingredient)
    }
    val ingredientsSorted = ingredients.sorted()
    val ingredientsFirstCapitalLetter = ingredientsSorted.mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar { it.uppercaseChar() } else ingredient
    }
    println(ingredientsFirstCapitalLetter.joinToString(", "))
}

const val NUMBER_OF_INGREDIENTS = 5