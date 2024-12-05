package lesson_13

fun main() {

    val contacts = mutableListOf<PhoneCatalog>()

    println("Номер телефона")
    val number = readln().toLongOrNull()
    println("Имя")
    val name = readln()
    println("Компания")
    val company = readln().takeIf { it.isNotBlank() }

    if (number != null) {
        contacts.add(PhoneCatalog(name, number, company))
    } else {
        println("Ошибка! Поле ввода номера пустое!")
    }

    for (i in 0..<contacts.size) {
        contacts[i].printInfo()
    }
}

class PhoneCatalog(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {

    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}