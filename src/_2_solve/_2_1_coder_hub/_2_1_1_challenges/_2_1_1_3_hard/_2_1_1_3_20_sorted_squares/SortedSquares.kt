package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_20_sorted_squares

fun main() {
    println(sortedSquares(mutableListOf(-4, -1, 0, 3, 10)))
    println(sortedSquares(mutableListOf(-7, -3, 2, 3, 11)))
    println(sortedSquares(mutableListOf(0, 1, 2, 3, 4)))
    print(sortedSquares(mutableListOf(-5, -3, -2, -1, 0)))
}

private fun sortedSquares(numbers : MutableList<Int>) = numbers
    .map { number : Int -> number * number }
    .sorted()
    .toMutableList()