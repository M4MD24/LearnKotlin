package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_14_max_element

fun main() {
    println(getMaximumNumber(mutableListOf(1, 2, 3, 4, 5, 1000)))
    println(getMaximumNumber(mutableListOf(32, 35, 23, 59, 20, 88)))
    println(getMaximumNumber(mutableListOf(-2, -563, -13, -8)))
    print(getMaximumNumber(mutableListOf(-54, 0, -88, -91, -5)))
}

private fun getMaximumNumber(numbers: MutableList<Int>): Int {
    var maximumNumber = numbers[0]
    for (index in 0 until numbers.size) {
        val currentNumber = numbers[index]
        if (currentNumber > maximumNumber)
            maximumNumber = currentNumber
    }
    return maximumNumber
}