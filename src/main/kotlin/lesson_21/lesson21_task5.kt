package lesson_21

fun Map<String, Int>.maxCategory(): String {

    val maxValue = values.max()
    return entries.find { it.value == maxValue }!!.key
}