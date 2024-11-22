package lesson_4

fun main() {

    println("Введите данные:")
    println("На корабле имеются повреждения? true/false")
    val isDamaged = readln().toBoolean()
    println("Состав экипажа (кол-во человек):")
    val crewNumber = readln().toInt()
    println("Число ящиков с провизией:")
    val provisions = readln().toInt()
    println("Погода благоприятна для выхода в море? true/false")
    val isWeatherFavorable = readln().toBoolean()

    if (isDamaged) {
        if (crewNumber == CREW_NUMBER_MAX && isWeatherFavorable && provisions >= PROVISIONS_MIN) {
            println("Корабль готов к отплытию")
        } else {
            println("Корабль не может покинуть порт")
        }
    } else {
        if (crewNumber in CREW_NUMBER_MIN..CREW_NUMBER_MAX && provisions > PROVISIONS_MIN) {
            println("Корабль готов к отплытию")
        } else {
            println("Корабль не может покинуть порт")
        }
    }
}

const val CREW_NUMBER_MIN = 55
const val CREW_NUMBER_MAX = 70
const val PROVISIONS_MIN = 50