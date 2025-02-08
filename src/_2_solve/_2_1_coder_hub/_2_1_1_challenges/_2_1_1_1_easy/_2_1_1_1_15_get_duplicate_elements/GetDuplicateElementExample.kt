package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_15_get_duplicate_elements

fun main() {
    println(getDuplicateNumbers(mutableListOf(2, 3, 2, 3)))
    println(getDuplicateNumbers(mutableListOf(10, 5, 9, 5)))
    println(getDuplicateNumbers(mutableListOf(6, 3, 12, 12)))
    print(getDuplicateNumbers(mutableListOf(3, -9, -9, -4)))
}

private fun getDuplicateNumbers(numbers: MutableList<Int>): MutableList<Int> {
    val duplicateNumbers: MutableList<Int> = mutableListOf()
    for (round in numbers.indices) {
        val targetNumber = numbers[round]
        for (index in round + 1 until numbers.size) {
            val currentNumber = numbers[index]
            if (!duplicateNumbers.contains(targetNumber) && targetNumber == currentNumber) {
                duplicateNumbers.add(targetNumber)
                break
            }
        }
    }
    return duplicateNumbers
}