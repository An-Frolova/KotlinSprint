package lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook = RegularBook("Война и мир", "Лев Толстой")
    val regularBook2 = RegularBook("Война и мир", "Лев Толстой")
    val dataBook = DataBook("Война и мир", "Лев Толстой")
    val dataBook2 = DataBook("Война и мир", "Лев Толстой")

    println(regularBook == regularBook2)
    println(dataBook == dataBook2)
}

/*
 Оператор == вызывает метод equals(). По умолчанию equals сравнивает ссылки на объекты. А значит сравнение
 может вернуть результат true, только если обе переменные хранят ссылки на один и тот же объект в памяти.
 В нашем случае были созданы два разных объекта, хоть и с идентичными полями.

 В дата классах equals переопределен. В этом случае сравниваются значения свойств класса. Т.к. в нашем случае
 они совпадают, результатом сравнения является true. */