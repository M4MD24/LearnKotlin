package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_b_arpa_s_hard_exam_and_mehrdad_s_naive_cheat

fun main() {
    val powerNumber = readln().toInt()
    print(returnLastDigitOfStaticNumber(powerNumber))

}

private fun returnLastDigitOfStaticNumber(powerNumber: Int): Byte = if (powerNumber == 0)
    1
else {
    when (powerNumber % 4) {
        0 -> 6
        1 -> 8
        2 -> 4
        else -> 2
    }
}