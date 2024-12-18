package lesson_21


fun String.vowelCount(): Int {

    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    return this.lowercase().count { it in vowels }
}