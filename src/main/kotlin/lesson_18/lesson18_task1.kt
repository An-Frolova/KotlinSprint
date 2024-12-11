package lesson_18

fun main() {

    val order1 = Order(1)
    val order2 = Order(2)

    val product = "крем"
    val products = mutableListOf("пиджак", "платье", "кеды")

    order1.printInfo(product)
    order2.printInfo(products)
}

class Order(
    val number: Int,
) {

    fun printInfo(product: String) {
        println("Заказан товар: $product")
    }

    fun printInfo(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }
}
