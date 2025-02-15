package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_r_age_in_days

fun main() {
    val days = readln().toLong()
    print(getAgeByDays(days))
}

const val DAYS_PER_YEAR = 365
const val DAYS_PER_MONTH = 30
private fun getAgeByDays(days: Long): String {
    val years = days / DAYS_PER_YEAR
    var remainingDays = days % DAYS_PER_YEAR
    val months = remainingDays / DAYS_PER_MONTH
    remainingDays %= DAYS_PER_MONTH.toLong()
    return """
        $years years
        $months months
        $remainingDays days""".trimIndent()
}