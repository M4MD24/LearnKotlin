package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_28_equal_check

fun main() {
    println(areEquals(1, 3))
    println(areEquals(4, 4))
    println(areEquals(0, 0))
    print(areEquals(2, 1))
}

private fun areEquals(firstNumber: Int, secondNumber: Int) = firstNumber == secondNumber