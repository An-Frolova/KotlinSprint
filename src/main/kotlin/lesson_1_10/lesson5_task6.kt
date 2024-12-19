package lesson_1_10

fun main() {

    println("Введите ваш вес (кг)")
    val weight = readln().toDouble()
    println("Введите ваш рост (см)")
    val height = readln().toFloat()

    val heightInMeters = height / CENTIMETERS_IN_METER
    val imt = weight / (heightInMeters * heightInMeters)

    if (imt < MINIMUM_PERMISSIBLE_BMI_VALUE) {
        println("Недостаточная масса тела")
    } else if (imt >= MINIMUM_PERMISSIBLE_BMI_VALUE && imt < MAXIMUM_PERMISSIBLE_BMI_VALUE) {
        println("Нормальная масса тела")
    } else if (imt >= MAXIMUM_PERMISSIBLE_BMI_VALUE && imt < DANGEROUS_BMI_VALUE) {
        println("Избыточная масса тела")
    } else if (imt >= DANGEROUS_BMI_VALUE) {
        println("Ожирение")
    }
}

const val CENTIMETERS_IN_METER = 100
const val MINIMUM_PERMISSIBLE_BMI_VALUE = 18.5
const val MAXIMUM_PERMISSIBLE_BMI_VALUE = 25
const val DANGEROUS_BMI_VALUE = 30