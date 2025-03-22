package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_p_calculating_function

fun main() {
    val number = readln().toLong()
    val alternatingSum = getAlternatingSum(number)
    print(alternatingSum)
}

private fun getAlternatingSum(number: Long) = if (number % 2 == 0L)
    number / 2
else
    -(number / 2 + 1)