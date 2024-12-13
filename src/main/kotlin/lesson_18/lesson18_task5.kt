package lesson_18

class Screen() {

    fun drawCircle(x: Int, y: Int) {
        println("Нарисован круг x$x y$y")
    }

    fun drawCircle(x: Float, y: Float) {
        println("Нарисован круг x$x y$y")
    }

    fun drawSquare(x: Int, y: Int) {
        println("Нарисован квадрат x$x y$y")
    }

    fun drawSquare(x: Float, y: Float) {
        println("Нарисован квадрат x$x y$y")
    }

    fun drawPoint(x: Int, y: Int) {
        println("Нарисована точка x$x y$y")
    }

    fun drawPoint(x: Float, y: Float) {
        println("Нарисована точка x$x y$y")
    }
}