package lesson_13

fun main() {
    val phoneNumber = PhoneBook("Елизавета", 89213580417)
    phoneNumber.printInfo()
}

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}