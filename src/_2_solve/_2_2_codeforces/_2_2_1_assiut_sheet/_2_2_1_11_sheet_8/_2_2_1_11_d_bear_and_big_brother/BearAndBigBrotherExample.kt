package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_d_bear_and_big_brother

fun main() {
    val (
        limakWeight,
        bobWeight
    ) = readln()
        .split(' ')
        .map { it.toByte() }
    val yearsCount = calculatingYearsCountOfExceedingFirstWeightToSecondWeight(
        limakWeight,
        bobWeight
    )
    print(yearsCount)
}

private fun calculatingYearsCountOfExceedingFirstWeightToSecondWeight(
    firstWeight: Byte,
    secondWeight: Byte
): Short {
    var yearsCount: Short = 0
    var currentFirstWeight = firstWeight.toShort()
    var currentSecondWeight = secondWeight.toShort()
    while (currentFirstWeight <= currentSecondWeight) {
        currentFirstWeight = (currentFirstWeight * 3).toShort()
        currentSecondWeight = (currentSecondWeight * 2).toShort()
        yearsCount++
    }
    return yearsCount
}