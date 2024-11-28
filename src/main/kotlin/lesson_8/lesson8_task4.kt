package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("курица", "сыр", "листья салата", "помидоры", "яйца", "масло оливковое", "чеснок")
    println("Ингредиенты в рецепте: ${arrayOfIngredients.joinToString(", ")}")
    println("Какой ингредиент вы хотите заменить?")
    var ingredientForChange = readln().lowercase()
    while (!arrayOfIngredients.contains(ingredientForChange)) {
        println("Ингредиента \"$ingredientForChange\" в рецепте нет. Попробуйте снова")
        ingredientForChange = readln().lowercase()
    }
    println("Введите название ингредиента для замены")
    val newIngredient = readln().lowercase()
    val index = arrayOfIngredients.indexOf(ingredientForChange)
    arrayOfIngredients[index] = newIngredient
    println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString(", ")}")
}