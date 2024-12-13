package lesson_18

abstract class ParcelBox() {

    abstract fun calculateSquare(): Int
}

class SquareBox(
    val sideLength: Int
) : ParcelBox() {

    override fun calculateSquare(): Int {
        return sideLength * sideLength * 6
    }
}

class RectangularBox(
    val parcelHeight: Int,
    val parcelWidth: Int,
    val parcelLength: Int,
) : ParcelBox() {

    override fun calculateSquare(): Int {
        return 2 * (parcelLength * parcelHeight + parcelHeight * parcelWidth + parcelWidth * parcelLength)
    }
}