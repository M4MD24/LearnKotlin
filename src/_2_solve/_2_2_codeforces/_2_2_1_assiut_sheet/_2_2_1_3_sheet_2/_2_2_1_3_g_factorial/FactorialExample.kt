package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_g_factorial

fun main() {
    val countOfNumbers = readln().toByte()
    repeat(countOfNumbers.toInt()) {
        val number = readln().toByte()
        println(getFactorial(number))
    }
}

private tailrec fun getFactorial(
    targetNumber: Byte,
    accumulator: Long = 1
): Long = if (targetNumber <= 1)
    accumulator
else getFactorial(
    (targetNumber - 1).toByte(),
    targetNumber * accumulator
)