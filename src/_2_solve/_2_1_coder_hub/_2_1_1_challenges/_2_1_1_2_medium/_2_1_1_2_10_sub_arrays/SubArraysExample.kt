package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_10_sub_arrays

fun main() {
    println(getResultOfSubtractBetweenNumbers(mutableListOf(2, 4, 88), mutableListOf(4, 2, 88)))
    println(getResultOfSubtractBetweenNumbers(mutableListOf(-3, 4, 0), mutableListOf(93, 22, 7)))
    println(getResultOfSubtractBetweenNumbers(mutableListOf(7, 8, 2), mutableListOf(4, 5, 1)))
    print(getResultOfSubtractBetweenNumbers(mutableListOf(19, 29), mutableListOf(10, 20)))
}

private fun getResultOfSubtractBetweenNumbers(firstNumbers: MutableList<Int>, secondNumbers: MutableList<Int>): MutableList<Int> {
    val resultOfSubtractBetweenNumbers = mutableListOf<Int>()
    for (index in firstNumbers.indices)
        resultOfSubtractBetweenNumbers.add(secondNumbers[index] - firstNumbers[index])
    return resultOfSubtractBetweenNumbers
}