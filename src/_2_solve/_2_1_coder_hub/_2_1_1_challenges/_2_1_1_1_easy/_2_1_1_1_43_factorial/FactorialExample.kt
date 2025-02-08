package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_43_factorial

fun main() = print(getFactorial(readln().toInt()))

private fun getFactorial(number: Int): Int {
    var multiplication = 1
    for (index in 2..number)
        multiplication *= index
    return multiplication
}