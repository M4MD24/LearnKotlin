package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_2_contest_1._2_2_1_2_i_lucky_numbers

fun main() {
    val number = readln().toByte()
    print(isLucky(number))
}

private fun isLucky(number: Byte): String {
    val firstDigit = (number % 10).toByte()
    val secondDigit = (number / 10).toByte()
    return if (
        firstDigit % secondDigit == 0 ||
        secondDigit % firstDigit == 0
    ) "YES"
    else
        "NO"
}