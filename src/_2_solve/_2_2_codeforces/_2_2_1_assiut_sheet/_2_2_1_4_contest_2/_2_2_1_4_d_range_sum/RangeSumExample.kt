package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_4_contest_2._2_2_1_4_d_range_sum

fun main() {
    val countOfCases = readln().toInt()
    repeat(countOfCases) {
        var (firstNumber, secondNumber) = readln()
            .split(' ')
            .map { it.toLong() }
        if (firstNumber > secondNumber)
            firstNumber = secondNumber.also { secondNumber = firstNumber }
        val sumOfNumbersFrom1ToNumberBeforeStartNumber = (firstNumber - 1) * firstNumber / 2
        val sumOfNumbersFrom1ToEndNumber = secondNumber * (secondNumber + 1) / 2
        println(sumOfNumbersFrom1ToEndNumber - sumOfNumbersFrom1ToNumberBeforeStartNumber)
    }
}