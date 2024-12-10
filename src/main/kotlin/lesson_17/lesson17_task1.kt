package lesson_17

class Quiz(
    val question: String,
    var answer: String,
) {

    private val _question = question
        get() = field

    private var _answer = answer
        get() = field
        set(value) {
            field = value
        }
}