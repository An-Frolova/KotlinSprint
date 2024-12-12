package lesson_19

fun main() {

    println("Вы можете добавить в аквариум следующих рыбок:")
    for (fish in Fishes.entries) println(fish.fishName)
}

enum class Fishes(val fishName: String) {

    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}