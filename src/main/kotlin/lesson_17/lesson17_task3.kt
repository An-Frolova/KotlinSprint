package lesson_17

fun main() {

    val folder = Folder("My Folder", 5, true)

    println(folder.name)
    println(folder.filesCount)
}

class Folder(
    private val folderName: String,
    private val filesCountInFolder: Int,
    private val isSecret: Boolean,
) {

    val name: String
        get() = if (isSecret) {
            "скрытая папка"
        } else {
            folderName
        }

    val filesCount: Int
        get() = if (isSecret) {
            0
        } else {
            filesCountInFolder
        }
}