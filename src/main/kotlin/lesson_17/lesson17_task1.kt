package lesson_17

class Quiz(
    private val question: String,
    private var answer: String,
) {

    val _question = question
        get() = field

    var _answer = answer
        get() = field
        set(value) {
            field = value
        }
}