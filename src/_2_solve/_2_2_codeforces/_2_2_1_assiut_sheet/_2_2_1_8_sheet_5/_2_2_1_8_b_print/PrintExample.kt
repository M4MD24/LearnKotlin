package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_b_print

fun main() {
    val targetNumber = readln().toShort()
    printAllNumbersFrom1ToTargetNumber(targetNumber)
}

private fun printAllNumbersFrom1ToTargetNumber(targetNumber: Short) {
    for (number in 1..targetNumber) {
        print(number)
        if (number < targetNumber)
            print(' ')
    }
}