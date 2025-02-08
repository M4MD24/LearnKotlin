package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_63_average

fun main() {
    println(getAverage(mutableListOf(2, 4, 9, 23, 435)))
    println(getAverage(mutableListOf(3, 5, 67, 1)))
    println(getAverage(mutableListOf(99, 314, 8, 200, 1)))
    print(getAverage(mutableListOf(72, 0, 23, 70, 1)))
}

private fun getAverage(numbers: MutableList<Int>) = numbers.average()