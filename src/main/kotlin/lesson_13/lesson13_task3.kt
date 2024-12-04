package lesson_13

fun main() {

    val phoneNumbers = mutableListOf<TelephoneDirectory>(
        TelephoneDirectory("Ольга", 89114043811, null),
        TelephoneDirectory("Мария", 89523210016, "null"),
        TelephoneDirectory("Кирилл", 89218930542, "Google"),
        TelephoneDirectory("Владимир", 89502109585, null),
        TelephoneDirectory("Ирина", 89113330819, "Ozon")
    )

    for (i in 0..<phoneNumbers.size) {
        phoneNumbers[i].printInfo()
        println()
    }
}

class TelephoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {

    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}