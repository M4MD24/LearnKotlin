package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_k_shift_right

fun main() {
    val firstLine = readln()
        .split(' ')
    val countOfNumbers = firstLine[0].toShort()
    val shiftTimes = firstLine[1].toByte()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
        .toIntArray()
    println(
        shiftRight(
            numbers,
            countOfNumbers,
            shiftTimes
        ).joinToString(" ")
    )
}

private fun shiftRight(
    numbers: IntArray,
    countOfNumbers: Short,
    shiftCount: Byte
): List<Int> {
    val effectiveShifts = shiftCount % countOfNumbers
    return numbers.takeLast(effectiveShifts) + numbers.take(countOfNumbers - effectiveShifts)
}