package lesson_15

fun main() {

    val car1 = Car()
    val car2 = Car()
    val truck = Truck()

    car1.loadPassengers(3)
    car1.move()
    car1.unloadPassengers()

    car2.loadPassengers(2)
    car2.move()
    car2.unloadPassengers()

    truck.loadCargo(2)
    truck.loadPassengers(1)
    truck.move()
    truck.unloadCargo()
    truck.unloadPassengers()
}

class Car() : Movable, PassengersTransportation {

    var canMove = true

    override fun move() {
        if (canMove) {
            println("Машина едет")
        } else {
            return
        }
    }

    override fun loadPassengers(currentPassengersQuantity: Int) {
        if (currentPassengersQuantity <= MAX_NUMBER_OF_PASSENGERS_FOR_CARS) {
            println("Пассажиры сели в машину")
        } else {
            println("Не хватает места!")
            canMove = false
        }
    }

    override fun unloadPassengers() {
        if (canMove) {
            println("Пассажиры вышли из машины")
        } else {
            return
        }
    }
}

class Truck() : Movable, CargoTransportation, PassengersTransportation {

    var canMove = true

    override fun loadCargo(currentCargoQuantityInTonne: Int) {
        if (currentCargoQuantityInTonne <= MAX_CARGO_QUANTITY_IN_TONNE) {
            println("Груз погружен в грузовик")
        } else {
            println("Не хватает места!")
            canMove = false
        }
    }

    override fun loadPassengers(currentPassengersQuantity: Int) {
        if (currentPassengersQuantity <= MAX_NUMBER_OF_PASSENGERS_FOR_TRUCK) {
            println("Пассажир сел в грузовик")
        } else {
            println("Не хватает места!")
            canMove = false
        }
    }

    override fun move() {
        if (canMove) {
            println("Грузовик едет")
        } else {
            return
        }
    }

    override fun unloadCargo() {
        if (canMove) {
            println("Груз разгружен")
        } else {
            return
        }
    }

    override fun unloadPassengers() {
        if (canMove) {
            println("Пассажир вышел из грузовика")
        } else {
            return
        }
    }
}

interface Movable {

    fun move()
}

interface CargoTransportation {

    fun loadCargo(currentCargoQuantityInTonne: Int)
    fun unloadCargo()
}

interface PassengersTransportation {

    fun loadPassengers(currentPassengersQuantity: Int)
    fun unloadPassengers()
}

const val MAX_CARGO_QUANTITY_IN_TONNE = 2
const val MAX_NUMBER_OF_PASSENGERS_FOR_CARS = 3
const val MAX_NUMBER_OF_PASSENGERS_FOR_TRUCK = 1