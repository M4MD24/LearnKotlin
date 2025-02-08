package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_56_get_mean

fun main() {
    println(getMean(mutableListOf(4, 1)))
    println(getMean(mutableListOf(6, 7, 8, 9)))
    println(getMean(mutableListOf(10, 15)))
    print(getMean(mutableListOf(1, 5, 3, 6, 6)))
}

private fun getMean(numbers: MutableList<Int>) = numbers.average()