package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_4_longest_alternating_sub_string

fun main() = print(getLongestAlternatingSubString(readln()))

private fun getLongestAlternatingSubString(text: String): String {
    var longestAlternatingSubString = StringBuilder()
    var currentAlternatingSubString = StringBuilder()
    var firstIndexNumber = 0
    var secondIndexNumber = 1
    while (secondIndexNumber < text.length) {
        val firstNumber = text[firstIndexNumber].code - '0'.code
        val secondNumber = text[secondIndexNumber].code - '0'.code
        val isOppositeParityBetweenTwoNumbers = (firstNumber % 2) != (secondNumber % 2)
        if (isOppositeParityBetweenTwoNumbers) {
            if (currentAlternatingSubString.isEmpty())
                currentAlternatingSubString.append(firstNumber)
                    .append(secondNumber)
            else currentAlternatingSubString.append(secondNumber)
        } else {
            if (currentAlternatingSubString.length > longestAlternatingSubString.length)
                longestAlternatingSubString = currentAlternatingSubString
            currentAlternatingSubString = StringBuilder()
        }
        firstIndexNumber++
        secondIndexNumber++
    }
    return longestAlternatingSubString.toString()
}