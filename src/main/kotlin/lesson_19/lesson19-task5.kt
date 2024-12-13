package lesson_19

fun main() {

    val persons = mutableListOf<Person>()

    println(
        "Вводите информацию в формате: [Ольга, ж]\nДля записи пола доступны обозначения:\nм - мужчина\nж - женщина"
    )

    while (persons.size < 5) {
        val input = readln().split(", ")
        val name = input[0].trim()
        val gender = input[1].trim()

        val setGender = when (gender) {
            "м" -> Gender.MALE
            "ж" -> Gender.FEMALE
            else -> Gender.OTHER
        }
        val person = Person(name, setGender)
        persons.add(person)
    }

    for (person in persons) {
        println("${person.name}, ${person.gender.nameToPrint}")
    }
}

class Person(
    val name: String,
    val gender: Gender,
)

enum class Gender(val nameToPrint: String) {

    MALE("мужчина"), FEMALE("женщина"), OTHER("не указано")
}