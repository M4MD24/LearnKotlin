package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_4_contest_2._2_2_1_4_g_construct_the_sum

fun main() {
    val countOfCases = readln().toInt()
    repeat(countOfCases) {
        val (
            maximumNumber,
            targetSum
        ) = readln()
            .split(' ')
            .map { it.toLong() }
        val numbers = mutableListOf<Long>()
        var sum = targetSum
        for (currentNumber in maximumNumber downTo 1) {
            if (sum >= currentNumber) {
                numbers.add(currentNumber)
                sum -= currentNumber
            }
            if (sum == 0L)
                break
        }
        println(
            if (sum == 0L)
                numbers.joinToString(" ")
            else
                -1
        )
    }
}