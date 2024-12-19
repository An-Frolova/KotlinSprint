package lesson_22

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook = RegularBook2("Гарри Поттер", "Джоан Роулинг")
    val dataBook = DataBook2("Основание", "Айзек Азимов")

    println(regularBook)
    println(dataBook)
}

/*
* При печати вызывается функция toString(), которую все классы наследуют от Any. По умолчанию toString возвращает
* строку, состоящую из названия класса и хэшкода объекта.
* В data классах метод toString переопределен таким образом, чтобы выводились названия свойств и их значения
*/