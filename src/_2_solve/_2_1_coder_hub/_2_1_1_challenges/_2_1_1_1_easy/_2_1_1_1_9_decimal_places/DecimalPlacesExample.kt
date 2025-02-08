package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_9_decimal_places

fun main() = print(decimalPlaces(readln()))

private fun decimalPlaces(number: String) = if (number.contains("."))
    number.length - number.indexOf('.') - 1
else 0