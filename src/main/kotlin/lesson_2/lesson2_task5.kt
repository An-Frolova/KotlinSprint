package lesson_2

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main() {

    val money = 70000
    val interestRate = 16.7
    val years  = 20

    val finalSum = money * (1 + interestRate * AS_DECIMAL).pow(years)
    val finalSumForPrint = BigDecimal(finalSum).setScale(3, RoundingMode.DOWN)
    // или, но тогда ответ будет строкой
    //val finalSumForPrint = String.format("%.3f", finalSum)
    println(finalSumForPrint)
}

const val AS_DECIMAL = 0.01