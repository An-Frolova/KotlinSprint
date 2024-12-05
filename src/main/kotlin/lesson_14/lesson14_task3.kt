package lesson_14


fun main() {

    val figureList = mutableListOf<Figure>()
    val numberRange = 5..20

    for (i in 1..5) {
        figureList.add(Circle("white", numberRange.random()))
        figureList.add(Circle("black", numberRange.random()))
        figureList.add(Rectangle("white", numberRange.random(), numberRange.random()))
        figureList.add(Rectangle("black", numberRange.random(), numberRange.random()))
    }

    val sumPerimeter = figureList.filter { it.color == "black" }.sumOf { it.calculatePerimeter() }
    val sumSquare = figureList.filter { it.color == "white" }.sumOf { it.calculateSquare() }

    println("Сумма периметров всех черных вигур равна $sumPerimeter")
    println("Сумма площадей всех белых вигур равна $sumSquare")
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateSquare(): Int
    abstract fun calculatePerimeter(): Int
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun calculateSquare(): Int {
        return (radius * radius * PI_NUMBER).toInt()
    }

    override fun calculatePerimeter(): Int {
        return (2 * PI_NUMBER * radius).toInt()
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {

    override fun calculateSquare(): Int {
        return width * height
    }

    override fun calculatePerimeter(): Int {
        return (width + height) * 2
    }
}

const val PI_NUMBER = 3.14