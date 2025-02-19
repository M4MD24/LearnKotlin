package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_r_sequence_of_numbers_and_sum

fun main() {
    while (true) {
        val (startNumber, endNumber) = readln()
            .split(' ')
            .map { it.toByte() }
            .sorted()
        if (startNumber > 0) {
            val rangeOfNumbers = startNumber..endNumber
            val sumOfNumbers = rangeOfNumbers.sum().toShort()
            println("${rangeOfNumbers.joinToString(" ")} sum =$sumOfNumbers")
        } else
            return
    }
}