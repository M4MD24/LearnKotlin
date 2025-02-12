package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_12_tribonacci

fun main() = print(getTribonacciNumbers(readln().toInt()))

private fun getTribonacciNumbers(length: Int): MutableList<Int> {
    val tribonacciNumbers = IntArray(length)
    if (length >= 1)
        tribonacciNumbers[0] = 1
    if (length >= 2)
        tribonacciNumbers[1] = 1
    if (length >= 3)
        tribonacciNumbers[2] = 1
    for (index in 3 until length)
        tribonacciNumbers[index] = tribonacciNumbers[index - 3] +
                tribonacciNumbers[index - 2] +
                tribonacciNumbers[index - 1]
    return tribonacciNumbers.toMutableList()
}