package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_51_merge_and_order

fun main() {
    println(mergeArrays(mutableListOf(1, 2), mutableListOf(3, 4)))
    println(mergeArrays(mutableListOf(1, 2), mutableListOf(1, 5)))
    println(mergeArrays(mutableListOf(), mutableListOf(1, 4, 9)))
    print(mergeArrays(mutableListOf(), mutableListOf()))
}

private fun mergeArrays(firstNumbers: MutableList<Int>, secondNumbers: MutableList<Int>) = (firstNumbers + secondNumbers)
    .sorted()
    .toMutableList()