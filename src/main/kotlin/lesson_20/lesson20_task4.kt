package lesson_20

fun main() {

    val stringList = listOf("Первый", "Второй", "Третий", "Четвертый", "Пятый")

    val lambdaList = stringList.map { item -> { println("Нажат элемен $item") } }

    lambdaList.forEachIndexed { index, function ->
        if (index % 2 == 0) {
            function()
        }
    }
}