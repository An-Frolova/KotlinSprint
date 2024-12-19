package lesson_21

import java.io.File

fun File.writeWordToFile(word: String) {

    val dataInFile = this.readText()
    this.writeText("${word.lowercase()}\n$dataInFile")
}