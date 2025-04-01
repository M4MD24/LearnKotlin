package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_m_palindromes

fun main() = print(maximumSubStringLength(readln()))

private fun maximumSubStringLength(text: String) = if (text.chars().distinct().count() == 1L)
    0
else
    if (text.compareTo(text.reversed()) == 0)
        text.length - 1
    else
        text.length