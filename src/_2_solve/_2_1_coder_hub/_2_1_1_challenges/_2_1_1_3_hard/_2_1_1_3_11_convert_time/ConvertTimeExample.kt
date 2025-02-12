package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_11_convert_time

fun main() = print(getTimeAfterConvert(readln()))

private fun getTimeAfterConvert(time: String) = if (
    time.contains("am") ||
    time.contains("pm")
) {
    val (hourPart, minute, period) = time.split(":", " ")
    val hour = if (period == "am")
        hourPart.toInt() % 12
    else
        hourPart.toInt() % 12 + 12
    "$hour:$minute"
} else {
    val (hourPart, minute) = time.split(':')
    val hour = hourPart.toInt()
    val period = if (hour < 12)
        "am"
    else
        "pm"
    "${if (hour % 12 == 0) 12 else hour % 12}:$minute $period"
}