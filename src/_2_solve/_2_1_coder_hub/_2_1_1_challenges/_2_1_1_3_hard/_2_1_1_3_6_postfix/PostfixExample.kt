package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_6_postfix

fun main() = print(postfix(readln()))

private fun postfix(text: String): Int {
    val numbers = mutableListOf<Int>()
    for (subText in text.split(" ".toRegex())
        .dropLastWhile { it.isEmpty() }
        .toTypedArray())
        if (subText.matches("\\d+".toRegex()))
            numbers.add(subText.toInt())
        else {
            val secondNumber = numbers.removeLast()
            val firstNumber = numbers.removeLast()
            numbers.add(
                when (subText) {
                    "+" -> firstNumber + secondNumber
                    "-" -> firstNumber - secondNumber
                    "*" -> firstNumber * secondNumber
                    else -> firstNumber / secondNumber
                }
            )
        }
    return numbers.removeLast()
}