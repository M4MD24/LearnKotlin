package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_17_date

fun main() = print(checkDateByCoderHubDate(readln()))

private fun checkDateByCoderHubDate(date: String): Boolean {
    val yearOfDate = date.substring(0, 4).toInt()
    return yearOfDate <= 2018 && yearOfDate > (2022 - 200)
}