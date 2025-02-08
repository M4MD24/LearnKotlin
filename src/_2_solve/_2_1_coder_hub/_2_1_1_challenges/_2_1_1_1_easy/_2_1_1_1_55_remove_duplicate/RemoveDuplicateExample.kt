package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_55_remove_duplicate

fun main() {
    println(getNumbersAfterRemoveDuplicateNumbers(mutableListOf(7, 8, 9, 7)))
    println(getNumbersAfterRemoveDuplicateNumbers(mutableListOf(10, -10, -10, 10)))
    println(getNumbersAfterRemoveDuplicateNumbers(mutableListOf(100, 101, 102, 100)))
    print(getNumbersAfterRemoveDuplicateNumbers(mutableListOf(12, 3)))
}

private fun getNumbersAfterRemoveDuplicateNumbers(numbers: MutableList<Int>) = numbers
    .distinct()
    .toMutableList()