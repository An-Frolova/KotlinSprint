package lesson_22

data class User(
    val name: String,
    val age: Int,
    val isOnline: Boolean,
)

fun main() {

    val user = User("Alice", 23, false)
    val (name, age, isOnline) = user
    println(name)
    println(age)
    println(isOnline)
}