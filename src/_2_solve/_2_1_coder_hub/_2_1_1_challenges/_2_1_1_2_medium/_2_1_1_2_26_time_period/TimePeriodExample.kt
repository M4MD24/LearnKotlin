package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_26_time_period

fun main() = print(getStringLengthComparison("2022-01-02T00:00:00", "2022-01-12T00:00:00"))

private fun getStringLengthComparison(firstDate: String, secondDate: String): Boolean {
    try {
        val firstLocalDate = java.time.LocalDateTime.parse(firstDate)
        val secondLocalDate = java.time.LocalDateTime.parse(secondDate)
        return firstLocalDate.isBefore(secondLocalDate) &&
                firstLocalDate.isBefore(java.time.LocalDateTime.now()) &&
                secondLocalDate.isBefore(java.time.LocalDateTime.now())
    } catch (_: java.time.format.DateTimeParseException) {
        return false
    }
}