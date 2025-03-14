package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_c_print_from_target_number_to_one

fun main() {
    val targetNumber = readln().toShort()
    printNumbersFromTargetNumberTo1(targetNumber)
}

private fun printNumbersFromTargetNumberTo1(number: Short) {
    if (number == 0.toShort())
        return
    print("$number")
    if (number > 1)
        print(' ')
    printNumbersFromTargetNumberTo1((number - 1).toShort())
}

// >
/*
private fun printNumbersFromTargetNumberTo1(number: Short) {
    print("$number")
    if (number <= 1)
        return
    else
        print(" ")
    printNumbersFromTargetNumberTo1((number - 1).toShort())
}
*/