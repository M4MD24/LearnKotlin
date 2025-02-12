package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_3_add_string_numbers

fun main() = print(addStringNumbersExample(readln(), readln()))

fun addStringNumbersExample(firstNumbers: String, secondNumbers: String) = try {
    (firstNumbers.toInt() + secondNumbers.toInt()).toString()
} catch (_: Exception) {
    "-1"
}