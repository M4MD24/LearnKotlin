package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_2_date_format

fun main() = print(getDateFormat(readln()))

private fun getDateFormat(date: String): String {
    val dateParts = date.split("/")
    val day = dateParts[2]
    val month = dateParts[1]
    val year = dateParts[0]
    return "$date | %s-%s-%s | %s/%s/%s".format(
        year,
        month,
        day,
        month,
        day,
        year
    )
}