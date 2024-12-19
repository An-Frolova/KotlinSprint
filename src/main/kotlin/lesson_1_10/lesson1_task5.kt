package lesson_1_10

fun main() {

    val secondsInFlight = 6480

    val minutes = secondsInFlight / 60
    val seconds = secondsInFlight % 60

    val hours = minutes / 60
    val remainingMinutes = minutes % 60

    println("${"%02d".format(hours)}:${"%02d".format(remainingMinutes)}:${"%02d".format(seconds)}")
}