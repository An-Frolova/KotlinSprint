package lesson_9

fun main() {

    val ingredientsForOneServing = mutableListOf(2, 50, 15)
    println("Укажите количество порций")
    val numberOfServings = readln().toInt()
    val ingredientsForSeveralServings = ingredientsForOneServing.map { it * numberOfServings }
    println(
        "На $numberOfServings порций вам понадобится: Яиц – ${ingredientsForSeveralServings[0]} шт., " +
                "молока – ${ingredientsForSeveralServings[1]} мл., " +
                "сливочного масла – ${ingredientsForSeveralServings[2]} гр."
    )
}