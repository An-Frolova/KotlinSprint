package lesson_13


fun main() {
    println("Номер")
    val numberString = readln()
    try {
        val numberLong = numberString.toLong()
        println("Введенный номер: $numberLong")
    } catch (e: Exception) {
        println("Ошибка: $e")
    }
}

class ContactList(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {

    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}