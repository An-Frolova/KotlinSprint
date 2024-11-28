package lesson_7

fun main() {

    val stringBuilder = StringBuilder()

    for (i in 1..3) {
        val letter = ('a'..'z').random()
        val number = (0..9).random()
        stringBuilder.append(letter, number)
    }
    println(stringBuilder)
}