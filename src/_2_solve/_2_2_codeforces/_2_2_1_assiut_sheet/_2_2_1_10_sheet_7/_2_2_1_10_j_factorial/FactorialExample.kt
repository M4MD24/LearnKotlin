package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_j_factorial

fun main() {
    val targetNumber = readln().toByte()
    print(getFactorial(targetNumber))
}

private tailrec fun getFactorial(
    currentNumber: Byte,
    accumulator: Long = 1
): Long = if (currentNumber <= 1)
    accumulator
else getFactorial(
    (currentNumber - 1).toByte(),
    currentNumber * accumulator
)

// >
/*
private fun getFactorial(currentNumber: Byte): Long = if (currentNumber == 1.toByte())
    1
else
    currentNumber * getFactorial((currentNumber - 1).toByte())
*/