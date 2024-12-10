package lesson_15


abstract class Product() {

    abstract val name: String
    abstract val count: Int
}

class Instrument(
    override val name: String,
    override val count: Int,
) : Product(), ComponentSearch

class Component(
    override val name: String,
    override val count: Int,
    val usedForInstruments: List<Instrument>
) : Product()

interface ComponentSearch {

    fun findComponent(instrumentName: String) {
        println("Выполняется поиск")
    }
}