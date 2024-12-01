package lesson_10

fun main() {

    println("Укажите желаемую длинну пароля")
    val charNumber = readln().toInt()
    println("Ваш пароль: \n${generatePassword(charNumber)}")
}

fun generatePassword(numberOfChars: Int): String {
    val numberRange = '0'.code..'9'.code
    val specialSymbolsRange = ' '.code..'/'.code
    val password = mutableListOf<Char>()

    for (i in 1..numberOfChars / 2) {
        password.add(numberRange.random().toChar())
        password.add(specialSymbolsRange.random().toChar())
    }
    if (numberOfChars - password.size == 1) {
        password.add(numberRange.random().toChar())
    }
    return password.joinToString("")
}