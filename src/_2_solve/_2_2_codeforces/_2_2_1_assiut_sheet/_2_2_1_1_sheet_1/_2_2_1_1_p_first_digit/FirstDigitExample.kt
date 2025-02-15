package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_p_first_digit

fun main() {
    val number = readln()
    val firstDigit = number[0].digitToInt()
    print(
        if (firstDigit % 2 == 0)
            "EVEN"
        else
            "ODD"
    )
}