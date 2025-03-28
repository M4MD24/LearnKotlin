package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_13_sheet_10._2_2_1_13_e_costruct_the_sum

fun main() {
    val countOfCases = readln().toByte()
    repeat(countOfCases.toInt()) {
        var (
            maximumNumber,
            targetNumber
        ) = readln()
            .split(' ')
            .map { it.toLong() }
        val selected = mutableListOf<Long>()
        for (number in maximumNumber downTo 1)
            if (targetNumber >= number) {
                selected.add(number)
                targetNumber -= number
            }
        println(
            if (targetNumber == 0L)
                "${selected.size} ${selected.joinToString(" ")}"
            else
                -1
        )
    }
}