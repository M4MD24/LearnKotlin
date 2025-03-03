package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_f_equation

fun main() {
    val (
        number,
        count
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    print(
        equation(
            number,
            count
        )
    )
}

private fun equation(
    targetNumber: Byte,
    count: Byte
): Long {
    var sum = 0L
    for (currentCount in count downTo 2)
        if (currentCount % 2 == 0)
            sum += power(
                targetNumber,
                currentCount.toByte()
            )
    return sum
}

private fun power(
    number: Byte,
    power: Byte
): Long {
    var sum = 1L
    for (currentNumber in power downTo 1)
        sum *= number
    return sum
}

// >
/*
fun main() {
    val (
        number,
        count
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    print(
        (2..count step 2).sumOf {
            number
                .toLong()
                .pow(it.toByte())
        }
    )
}

private fun Long.pow(power: Byte) = (1..power)
    .fold(1L)
    { accumulator, number -> accumulator * this }
*/