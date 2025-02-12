package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_2_leap_25_day_2_general_trip._2_1_2_2_1_easy._2_1_2_2_1_1_add_binary

fun main() = print(addBinary(readln(), readln()))

private fun addBinary(firstNumber: String, secondNumber: String) = (firstNumber.toInt(2) + secondNumber.toInt(2)).toString(2)