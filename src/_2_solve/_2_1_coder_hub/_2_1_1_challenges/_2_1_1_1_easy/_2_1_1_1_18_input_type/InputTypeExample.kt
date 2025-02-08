package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_18_input_type

fun main() = print(inputType(readln()))

private fun inputType(value: String) = if (value.contains("."))
    "double"
else if (value.matches(".*[0-9]".toRegex()))
    "integer"
else
    "string"