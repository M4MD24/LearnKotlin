package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_4_contest_2._2_2_1_4_f_break_number

fun main() {
    val countOfValues = readln()
    val values = readln().split(' ')
    print(values.maxOf { it.toLong().countTrailingZeroBits() })
}

// >
/*
import kotlin.math.max

fun main() {
    val countOfValues = readln().toInt()
    val values = readln()
        .split(' ')
        .map { it.toLong() }
    var maximumNumberOfDivisionTimes = 0
    values.forEach { value ->
        var numberOfDivisionTimes = 0
        var currentValue = value
        while (isEven(currentValue)) {
            numberOfDivisionTimes++
            currentValue /= 2
        }
        maximumNumberOfDivisionTimes = max(
            numberOfDivisionTimes,
            maximumNumberOfDivisionTimes
        )
    }
    print(maximumNumberOfDivisionTimes)
}

private fun isEven(currentValue: Long) = currentValue % 2 == 0L
*/