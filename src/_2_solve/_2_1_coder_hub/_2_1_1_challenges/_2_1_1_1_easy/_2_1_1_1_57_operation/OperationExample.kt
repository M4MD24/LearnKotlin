package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_57_operation

fun main() = print(operation(readln().toInt(), readln().toInt()))

private fun operation(firstNumber: Int, secondNumber: Int) = when (24) {
    firstNumber / secondNumber -> "divided"
    firstNumber * secondNumber -> "multiplied"
    firstNumber + secondNumber -> "added"
    firstNumber - secondNumber -> "subtracted"
    else -> "None"
}