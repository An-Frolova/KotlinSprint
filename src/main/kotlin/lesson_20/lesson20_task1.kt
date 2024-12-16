package lesson_20

fun main() {

    val printGreeting: (userName: String) -> String = { userName ->
        "С наступающим Новым Годом, $userName!"
    }

    println(printGreeting("Иван"))
}