package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_19_smallest_number

fun main() {
    println(getMaximumNumber(mutableListOf(13, 2, 1, 4, 106)))
    println(getMaximumNumber(mutableListOf(90, 87, 56, 33, 83)))
    println(getMaximumNumber(mutableListOf(91, 67, 223, 943, 34)))
    print(getMaximumNumber(mutableListOf(43, 3, -5, 205)))
}

private fun getMaximumNumber(numbers: MutableList<Int>) = numbers.minOf { it }