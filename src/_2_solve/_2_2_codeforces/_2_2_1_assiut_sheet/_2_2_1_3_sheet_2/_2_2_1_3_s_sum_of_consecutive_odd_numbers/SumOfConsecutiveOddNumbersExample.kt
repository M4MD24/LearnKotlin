package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_s_sum_of_consecutive_odd_numbers

fun main() {
    val countOfValues = readln().toByte()
    repeat(countOfValues.toInt()) {
        val (startNumber, endNumber) = readln()
            .split(' ')
            .map { it.toShort() }
            .sorted()
        val rangeOfNumbers = startNumber + 1..<endNumber
        val sumOfOddNumbers = rangeOfNumbers
            .filter { it % 2 != 0 }
            .sum()
        println(sumOfOddNumbers)
    }
}