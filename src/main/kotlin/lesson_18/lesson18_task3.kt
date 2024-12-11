package lesson_18

fun main() {

    val fox = Fox("Алиса")
    val dog = Dog("Шарик")
    val cat = Cat("Кузя")

    val list: List<Animal> = listOf(fox, dog, cat)
    for (animal in list) {
        animal.eat()
    }
}

abstract class Animal(
    val name: String,

    ) {
    open fun eat() {}

    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест рыбу")
    }
}