package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_f_print_even_indices

fun main() {
    val countOfNumbers = readln().toShort()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    printEvenIndicesReversed(
        numbers,
        if (countOfNumbers % 2 == 0)
            countOfNumbers - 2
        else
            countOfNumbers - 1
    )
}

private fun printEvenIndicesReversed(
    numbers: List<Int>,
    index: Int
) {
    if (index < 0)
        return
    print("${numbers[index]} ")
    printEvenIndicesReversed(
        numbers,
        index - 2
    )
}