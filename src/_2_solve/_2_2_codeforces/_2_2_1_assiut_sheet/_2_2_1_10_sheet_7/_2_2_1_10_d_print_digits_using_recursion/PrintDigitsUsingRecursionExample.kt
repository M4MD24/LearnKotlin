package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_d_print_digits_using_recursion

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val number = readln().toInt()
        printDigits(number)
        println()
    }
}

private fun printDigits(number: Int) {
    if (number < 10) {
        print("$number ")
        return
    }
    printDigits(number / 10)
    print("${number % 10} ")
}