package lesson_1_10

fun main() {

    println("Введите число, которое будет соответсвовать количеству символов в пароле")
    var charNumber = readln().toInt()
    while (charNumber < MIN_LENGTH_OF_PASSWORD) {
        println("Минимальное количество символов - $MIN_LENGTH_OF_PASSWORD")
        charNumber = readln().toInt()
    }

    val numberRange = '0'.code..'9'.code
    val letterRange = 'a'.code..'z'.code
    val upperCaseLetterRange = 'A'.code..'Z'.code
    val listOfRanges = numberRange + letterRange + upperCaseLetterRange

    val listOfRandomChars = mutableListOf<Char>()

    val char1 = numberRange.random().toChar()
    val char2 = letterRange.random().toChar()
    val char3 = upperCaseLetterRange.random().toChar()
    listOfRandomChars.add(char1)
    listOfRandomChars.add(char2)
    listOfRandomChars.add(char3)

    val remainingChars = charNumber - listOfRandomChars.size

    for (i in 1..remainingChars) {
        val char = listOfRanges.random().toChar()
        listOfRandomChars.add(char)
    }

    listOfRandomChars.shuffle()
    println(listOfRandomChars.joinToString(""))
}

const val MIN_LENGTH_OF_PASSWORD = 6