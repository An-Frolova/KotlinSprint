package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("курица", "сыр", "листья салата", "помидоры", "яйца", "масло оливковое", "чеснок")
    println("Введите ингредиент, который хотите найти")
    val userIngredient = readln().lowercase()
    if (arrayOfIngredients.contains(userIngredient)) {
        println("Ингредиент $userIngredient в рецепте есть")
        return
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}