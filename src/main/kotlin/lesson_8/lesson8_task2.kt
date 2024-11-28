package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("курица", "сыр", "листья салата", "помидоры", "яйца", "масло оливковое", "чеснок")
    println("Введите ингредиент, который хотите найти")
    val userIngredient = readln().lowercase()
    for (ingredients in arrayOfIngredients) {
        if (userIngredient == ingredients) {
            println("Ингредиент $userIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}