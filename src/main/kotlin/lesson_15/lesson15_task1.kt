package lesson_15

fun main() {

    val crucianCarp = CrucianCarp()
    val seagull = Seagull()
    val duck = Duck()

    crucianCarp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}

interface Swimmable {

    fun swim()
}

interface Flyable {

    fun fly()
}

class CrucianCarp() : Swimmable {

    override fun swim() {
        println("Карась плывет")
    }
}

class Seagull() : Flyable {

    override fun fly() {
        println("Чайка летит")
    }
}

class Duck() : Flyable, Swimmable {

    override fun swim() {
        println("Утка плывет")
    }

    override fun fly() {
        println("Утка летит")
    }
}