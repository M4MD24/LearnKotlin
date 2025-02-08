package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_4_string_builder

fun main() = print(stringBuilder(readln()))

private fun stringBuilder(text: String): String {
    val stack = mutableListOf<Pair<Int, StringBuilder>>()
    var currentString = StringBuilder()
    var number = 0

    for (character in text) {
        when {
            character.isDigit() -> number = number * 10 + (character - '0')
            character == '[' -> {
                stack.add(Pair(number, currentString))
                currentString = StringBuilder()
                number = 0
            }

            character == ']' -> {
                val (repeatCount, prevString) = stack.removeAt(stack.size - 1)
                currentString = prevString.append(currentString.toString().repeat(repeatCount))
            }

            else -> currentString.append(character)
        }
    }

    return currentString.toString()
}