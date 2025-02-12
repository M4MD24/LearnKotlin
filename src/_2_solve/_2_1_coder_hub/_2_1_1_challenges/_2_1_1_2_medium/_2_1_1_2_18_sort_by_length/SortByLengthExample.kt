package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_18_sort_by_length

fun main() = print(getTextAfterSortByLength(readln()))

private fun getTextAfterSortByLength(text: String) = text.split(' ')
    .sortedWith(compareBy({ it.length }))
    .joinToString(" ")