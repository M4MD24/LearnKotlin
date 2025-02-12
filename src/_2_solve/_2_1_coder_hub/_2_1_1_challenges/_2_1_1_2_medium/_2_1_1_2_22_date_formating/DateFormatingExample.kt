package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_22_date_formating

fun main() = print(dateFormating(readln()))

private fun dateFormating(date: String): String = date
    .split('-')
    .let { "${it[2]}-${it[1]}-${it[0]}" }