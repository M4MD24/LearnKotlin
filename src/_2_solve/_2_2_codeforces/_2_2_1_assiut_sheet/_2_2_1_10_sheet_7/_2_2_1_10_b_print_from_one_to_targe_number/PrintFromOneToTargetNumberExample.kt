package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_b_print_from_one_to_targe_number

fun main() {
    val targetNumber = readln().toShort()
    printNumbersFrom1ToTargetNumber(targetNumber)
}

private fun printNumbersFrom1ToTargetNumber(number: Short) {
    print("$number")
    if (number <= 1)
        return
    else
        println()
    printNumbersFrom1ToTargetNumber((number - 1).toShort())
}