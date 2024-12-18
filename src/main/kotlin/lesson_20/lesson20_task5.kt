package lesson_20

fun main() {

    val robot = Robot()

    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}

class Robot {

    private val phrases = listOf(
        "Привет! Как я могу вам помочь сегодня?",
        "Моя цель — сделать вашу жизнь проще.",
        "Ваша улыбка заряжает меня энергией больше, чем солнечная батарея!",
        "Ошибка? Это просто моя попытка быть оригинальным.",
        "Я всегда рад помочь, обращайтесь снова!",
    )

    private var modifier: (String) -> String = { it }

    fun say() {
        println(modifier((phrases).random()))
    }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }
}