package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_1_odd_vs_even

fun main() = print(oddsVsEvens(readln().toInt()))

fun oddsVsEvens(number: Int): String {
    val digits = number.toString()
    val lengthOfDigits = digits.length
    val numbers = mutableListOf<Int>()
    for (index in 0 until lengthOfDigits)
        numbers.add(digits[index].code - '0'.code)
    val sumOfOddNumbers = numbers
        .filter { it % 2 != 0 }
        .sum()
    val sumOfEvenNumbers = numbers
        .filter { it % 2 == 0 }
        .sum()
    return if (sumOfOddNumbers == sumOfEvenNumbers)
        CasesOfSumNumbers.equal.toString()
    else if (sumOfOddNumbers > sumOfEvenNumbers)
        CasesOfSumNumbers.odd.toString()
    else
        CasesOfSumNumbers.even.toString()
}