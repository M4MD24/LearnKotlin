package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_m_distinct_numbers

fun main() {
    val countOfNumbers = readln().toInt()
    val numbers = if (countOfNumbers > 0)
        readln()
            .split(' ')
            .map { it.toShort() }
    else
        emptyList()
    printDistinctNumbers(numbers)
}

private fun printDistinctNumbers(numbers: List<Short>) = print(numbers.distinct().size)

// > 1
/*
private fun printDistinctNumbers(numbers: List<Short>) {
    val distinctNumbers = hashSetOf<Short>()
    for (number in numbers)
        distinctNumbers.add(number)
    print(distinctNumbers.size)
}
*/

// > 2
/*
private fun printDistinctNumbers(numbers: List<Short>) = print(numbers.toHashSet().size)
*/