package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_i_smallest_pair

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        val countOfValues = readln().toByte()
        val numbers = readln()
            .split(' ')
            .map { it.toInt() }
        val resultsOfRequiredCalculation = mutableListOf<Int>()
        numbers.forEachIndexed { indexOfFirstValue, firstValue ->
            numbers.forEachIndexed { indexOfSecondValue, secondValue ->
                if (indexOfSecondValue > indexOfFirstValue)
                    resultsOfRequiredCalculation.add(
                        getResultOfRequiredCalculation(
                            indexOfFirstValue,
                            indexOfSecondValue,
                            firstValue,
                            secondValue
                        )
                    )
            }
        }
        println(resultsOfRequiredCalculation.minOf { it })
    }
}

private fun getResultOfRequiredCalculation(
    indexOfFirstValue: Int,
    indexOfSecondValue: Int,
    firstValue: Int,
    secondValue: Int
) = firstValue + secondValue + indexOfSecondValue - indexOfFirstValue