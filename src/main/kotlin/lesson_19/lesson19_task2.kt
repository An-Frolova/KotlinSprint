package lesson_19

fun main() {

    val item = Item("блокнот", 92, Category.STATIONERY)
    val item2 = Item("шорты", 103, Category.CLOTHES)
    val item3 = Item("заколка", 28, Category.OTHER)

    item.printInfo()
    item2.printInfo()
    item3.printInfo()
}

enum class Category {

    CLOTHES, STATIONERY, OTHER;

    fun getCategoryName(): String {
        return when (this) {
            Category.CLOTHES -> "Одежда"
            Category.STATIONERY -> "Канцелярские товары"
            Category.OTHER -> "Разное"
        }
    }
}

class Item(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun printInfo() {
        println("Название: $name Раздел: ${category.getCategoryName()}")
    }
}