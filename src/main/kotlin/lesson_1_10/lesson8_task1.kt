package lesson_1_10

fun main() {

    val numberOfViews = IntArray(7)
    numberOfViews[0] = 203
    numberOfViews[1] = 191
    numberOfViews[2] = 268
    numberOfViews[3] = 290
    numberOfViews[4] = 288
    numberOfViews[5] = 420
    numberOfViews[6] = 497

    var viewsPerWeek = 0

    for (i in numberOfViews) {
        viewsPerWeek += i
    }
    println(viewsPerWeek)
}