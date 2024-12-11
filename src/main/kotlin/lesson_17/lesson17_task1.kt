package lesson_17

class Quiz(
    quizQuestion: String,
    quizAnswer: String,
) {

    val question = quizQuestion
        get() = field

    var answer = quizAnswer
        get() = field
        set(value) {
            field = value
        }
}