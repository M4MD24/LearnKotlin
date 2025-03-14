package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_q_product

fun main() {
    val (
        startRangeValue,
        endRangeValue,
        moduloValue
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val productModulo = calculateProductModulo(
        startRangeValue,
        endRangeValue,
        moduloValue
    )
    print(productModulo)
}

private fun calculateProductModulo(
    startRangeValue: Int,
    endRangeValue: Int,
    moduloValue: Int
) = (startRangeValue..endRangeValue)
    .fold(1L) { accumulator, currentNumber ->
        (accumulator * (currentNumber % moduloValue)) % moduloValue
    }