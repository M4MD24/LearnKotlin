package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_k_combinantion_and_permutation

fun main() {
    val (
        totalElements,
        chosenElements
    ) = readln()
        .split(' ')
        .map { it.toInt() }
    val permutation = getPermutation(totalElements, chosenElements)
    val combination = getCombination(permutation, chosenElements)
    println("$combination $permutation")
}

private fun getPermutation(
    totalElements: Int,
    targetNumber: Int
) = getCombination(
    getFactorial(totalElements),
    totalElements - targetNumber
)

private fun getCombination(
    permutation: Long,
    targetNumber: Int
) = permutation / getFactorial(targetNumber)

private fun getFactorial(number: Int): Long = if (number == 0)
    1L
else
    (1L..number).reduce { accumulator, index -> accumulator * index }