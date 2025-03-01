package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_45_add_binary

fun main() = print(addBinary(readln(), readln()))

private fun addBinary(firstNumber: String, secondNumber: String) = (firstNumber.toInt(2) + secondNumber.toInt(2)).toString(2)