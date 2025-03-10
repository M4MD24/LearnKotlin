package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_p_log_two

fun main() {
    val number = readln().toLong()
    print(getLog2(number))
}

private fun getLog2(
    number: Long,
    count: Int = 0
): Int = if (number < 2)
    count
else
    getLog2(number / 2, count + 1)