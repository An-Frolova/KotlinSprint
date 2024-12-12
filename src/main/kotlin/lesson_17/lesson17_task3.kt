package lesson_17

fun main() {

    val folder = Folder("My Folder", 5, true)

    println(folder.name)
    println(folder.filesCount)
}

class Folder(
    folderName: String,
    filesCountInFolder: Int,
    val isSecret: Boolean,
) {

    val name = folderName
        get() = if (isSecret) {
            "скрытая папка"
        } else {
            field
        }

    val filesCount = filesCountInFolder
        get() = if (isSecret) {
            0
        } else {
            field
        }
}