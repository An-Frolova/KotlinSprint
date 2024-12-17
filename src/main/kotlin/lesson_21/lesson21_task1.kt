package lesson_21


fun String.vowelCount(): Int {

    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    var count = 0
    this.lowercase().forEach { if (it in vowels) count++ }
    return count
}