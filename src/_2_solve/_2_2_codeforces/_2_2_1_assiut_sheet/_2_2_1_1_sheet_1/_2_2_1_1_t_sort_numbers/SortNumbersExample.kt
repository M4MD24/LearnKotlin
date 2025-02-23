package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_t_sort_numbers

fun main() {
    val numbers = readln()
        .split(" ")
        .map { it.toInt() }
    println(numbers.sorted().joinToString("\n"))
    println()
    numbers.forEach(::println)
}