package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_t_olesya_and_rodion

fun main() {
    val (
        digitCount,
        divisor
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    print(
        findValidNumber(
            digitCount,
            divisor
        )
    )
}

private fun findValidNumber(
    digitCount: Byte,
    divisor: Byte
) = if (
    digitCount == 1.toByte() &&
    divisor == 10.toByte()
)
    -1
else {
    val number = StringBuilder()
    number.append(divisor)
    repeat(digitCount - number.length) { number.append(0) }
    number
}

// >
/*
private fun findValidNumber(
    digitCount: Byte,
    divisor: Byte
) = if (
    digitCount == 1.toByte() &&
    divisor == 10.toByte()
)
    "-1"
else
    if (divisor.toInt() == 10)
        BigInteger(divisor.toString()).pow(digitCount - 1).toString()
    else
        divisor.toString().repeat(digitCount.toInt())
*/