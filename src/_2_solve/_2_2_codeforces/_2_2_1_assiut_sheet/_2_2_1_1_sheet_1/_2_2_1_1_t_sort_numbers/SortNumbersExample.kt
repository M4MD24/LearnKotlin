package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_t_sort_numbers

fun main() {
    val line = readln().split(' ')
    val firstNumber = line[0].toInt()
    val secondNumber = line[1].toInt()
    val thirdNumber = line[2].toInt()
    val numbers = intArrayOf(
        firstNumber,
        secondNumber,
        thirdNumber
    )
    numbers.sort()
    println(numbers.joinToString { "\n" })
    numbers.sortDescending()
    print(numbers.joinToString { "\n" })
}