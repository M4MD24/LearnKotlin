package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_28_most_frequent_element

fun main() {
    println(mostFrequentElement(mutableListOf(13, 2, 1, 2, 10, 2, 1, 1, 2, 2)))
    println(mostFrequentElement(mutableListOf(1, 2, 3, 4, 1, 5, -5, -5, -5, -5, -5, 6)))
    println(mostFrequentElement(mutableListOf(1, 2, 3, 3, 3, 3)))
    print(mostFrequentElement(mutableListOf(0, 5, 6, 2, 1, 5)))
}

private fun mostFrequentElement(numbers: MutableList<Int>) = numbers
    .groupingBy { it }
    .eachCount()
    .maxByOrNull { it.value }
    ?.key
    ?: 0