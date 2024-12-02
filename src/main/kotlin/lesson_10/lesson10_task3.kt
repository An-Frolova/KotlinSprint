package lesson_10

fun main() {

    println("Укажите желаемую длину пароля")
    val charNumber = readln().toInt()
    println("Ваш пароль: \n${generatePassword(charNumber)}")
}

fun generatePassword(numberOfChars: Int): String {
    val numberRange = '0'.code..'9'.code
    val specialSymbolsRange = ' '.code..'/'.code
    val password = mutableListOf<Char>()

    for (i in 1..numberOfChars) {
        if (i % 2 == 0) {
            password.add(specialSymbolsRange.random().toChar())
        } else {
            password.add(numberRange.random().toChar())
        }
    }
    return password.joinToString("")
}