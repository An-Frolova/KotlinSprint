package lesson_4

fun main() {

    val day = 5

    println("""
        Упражнения для рук:    ${day%2==1}
        Упражнения для ног:    ${day%2==0}
        Упражнения для спины:  ${day%2==0}
        Упражнения для пресса: ${day%2==1}
    """.trimIndent())
}