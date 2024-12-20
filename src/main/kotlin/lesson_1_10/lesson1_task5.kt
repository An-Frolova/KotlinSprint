package lesson_1_10

fun main() {

    val secondsInFlight = 6480

    val minutes = secondsInFlight / SECONDS_IN_MINUTE
    val seconds = secondsInFlight % SECONDS_IN_MINUTE

    val hours = minutes / MINUTES_IN_HOUR
    val remainingMinutes = minutes % MINUTES_IN_HOUR

    println("${"%02d".format(hours)}:${"%02d".format(remainingMinutes)}:${"%02d".format(seconds)}")
}

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60