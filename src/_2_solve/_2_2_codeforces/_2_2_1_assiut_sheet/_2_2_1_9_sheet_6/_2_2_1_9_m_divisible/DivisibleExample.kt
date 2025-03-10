package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_m_divisible

fun main() {
    val (
        number,
        divisor
    ) = readln().split(' ')
    var remainder = 0L
    val reminder = divisor.toLong()
    for (char in number)
        remainder = (remainder * 10 + (char - '0')) % reminder
    print(
        if (remainder == 0L)
            "YES"
        else
            "NO"
    )
}