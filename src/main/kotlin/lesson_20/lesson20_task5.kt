package lesson_20

fun main() {

    val robot = Robot()

    robot.say()
    robot.setModifier { list -> list.map { it.reversed() } }
    robot.say()
}

class Robot {

    private var phrases = listOf(
        "Привет! Как я могу вам помочь сегодня?",
        "Моя цель — сделать вашу жизнь проще.",
        "Ваша улыбка заряжает меня энергией больше, чем солнечная батарея!",
        "Ошибка? Это просто моя попытка быть оригинальным.",
        "Я всегда рад помочь, обращайтесь снова!",
    )

    fun say() {
        println(phrases.random())
    }

    fun setModifier(modifier: (List<String>) -> List<String>) {
        phrases = modifier(phrases)
    }
}