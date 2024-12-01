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
    val ingredientsAsOneString =
        ingredients.sorted().joinToString(", ", postfix = ".").replaceFirstChar { it.uppercaseChar() }
    println(ingredientsAsOneString)
}

const val NUMBER_OF_INGREDIENTS = 5