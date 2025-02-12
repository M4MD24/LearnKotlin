package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_8_number_to_string

fun main() = print(getNumberToWords(readln().toInt()))

private val BELOW_TWENTY = arrayOf(
    "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
)

private val TENS = arrayOf("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")

private fun getNumberToWords(number: Int): String {
    return if (number == 0)
        "zero"
    else if (number < 20)
        BELOW_TWENTY[number]
    else if (number < 100)
        TENS[number / 10] + (
                if (number % 10 > 0)
                    "-" + BELOW_TWENTY[number % 10]
                else
                    ""
                )
    else
        BELOW_TWENTY[number / 100] + " hundred" + (
                if (number % 100 > 0)
                    " " + getNumberToWords(number % 100)
                else
                    ""
                )
}