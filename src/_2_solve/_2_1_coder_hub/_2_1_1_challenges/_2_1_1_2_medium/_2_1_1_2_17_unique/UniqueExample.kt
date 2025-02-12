package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_17_unique

fun main() {
    println(getMaximumUnique(mutableListOf(1, 1, 1, 2, 1, 1)))
    println(getMaximumUnique(mutableListOf(3, -4, 3, 3, 3)))
    println(getMaximumUnique(mutableListOf(2, 4, -2)))
    print(getMaximumUnique(mutableListOf(2, 3, 2, 6, 2)))
}

private fun getMaximumUnique(numbers: MutableList<Int>) = numbers
    .groupingBy { it }
    .eachCount()
    .filterValues { it == 1 }
    .keys
    .toMutableList()