package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_37_sum_even

fun main() {
    println(sumEven(mutableListOf(11, 0, 5, 22)))
    println(sumEven(mutableListOf(16, 3, 9, 2)))
    println(sumEven(mutableListOf(12, 65, 42)))
    print(sumEven(mutableListOf(1, 3, 7)))
}

private fun sumEven(numbers: MutableList<Int>) = numbers
    .filter { number -> number % 2 == 0 }
    .sum()