package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_75_calculate_fasting_hours

fun main() {
    val testCases = mutableListOf(
        mutableListOf("04:30") to mutableListOf("18:30"),
        mutableListOf("05:00") to mutableListOf("18:00"),
        mutableListOf("04:45") to mutableListOf("18:15"),
        mutableListOf("04:30", "05:00") to mutableListOf("18:30", "18:00")
    )

    for ((suhoorTimes, iftarTimes) in testCases)
        println(calculateFastingHours(suhoorTimes, iftarTimes))
}

private fun calculateFastingHours(
    suhoorTimes: MutableList<String>,
    iftarTimes: MutableList<String>
): Double = suhoorTimes.indices.sumOf { index ->
    val (
        suhoorHour,
        suhoorMinute
    ) = getHoursAndMinutes(
        suhoorTimes,
        index.toByte()
    )
    val (
        iftarHour,
        iftarMinute
    ) = getHoursAndMinutes(
        iftarTimes,
        index.toByte()
    )
    (iftarHour - suhoorHour) + (iftarMinute - suhoorMinute) / 60.0
}

private fun getHoursAndMinutes(
    times: MutableList<String>,
    index: Byte
) = times[index.toInt()]
    .split(':')
    .map { it.toByte() }