package lesson_16

fun main() {

    val circle = Circle(4)
    println("Площадь круга: ${circle.calculateSquare()}")
    println("Длина окружности: ${circle.calculatePerimeter()}")
}

class Circle(private val radius: Int) {

    fun calculateSquare(): Double {
        return radius * radius * PI
    }

    fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

private const val PI = 3.14