package lesson_11


class Category(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val recipes: MutableList<Recipe>,
)

class Recipe(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val category: Category,
    val ingredients: MutableList<Ingredient>,
    val cookingSteps: MutableList<String>,
    var inFavorites: Boolean = false,
)

class Ingredient(
    val id: Int,
    val name: String,
    val countForOneServing: Int,
)