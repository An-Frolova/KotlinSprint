package lesson_1_10

fun main() {

    println("Введите ваш вес (кг)")
    val weight = readln().toDouble()
    println("Введите ваш рост (см)")
    val height = readln().toFloat()

    val heightInMeters = height / CENTIMETERS_IN_METER
    val bmi = weight / (heightInMeters * heightInMeters)

    val weightCategory = when {
        bmi < MINIMUM_PERMISSIBLE_BMI_VALUE -> "Недостаточная масса тела"
        bmi >= MINIMUM_PERMISSIBLE_BMI_VALUE && bmi < MAXIMUM_PERMISSIBLE_BMI_VALUE -> "Нормальная масса тела"
        bmi >= MAXIMUM_PERMISSIBLE_BMI_VALUE && bmi < DANGEROUS_BMI_VALUE -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("ИМТ: ${String.format("%.2f", bmi)}. Категория: $weightCategory")
}

const val CENTIMETERS_IN_METER = 100
const val MINIMUM_PERMISSIBLE_BMI_VALUE = 18.5
const val MAXIMUM_PERMISSIBLE_BMI_VALUE = 25
const val DANGEROUS_BMI_VALUE = 30