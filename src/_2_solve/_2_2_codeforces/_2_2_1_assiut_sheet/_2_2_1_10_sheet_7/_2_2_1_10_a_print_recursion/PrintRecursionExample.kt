package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_a_print_recursion

fun main() {
    val countOfLines = readln().toByte()
    print(returnILoveRecursion(countOfLines))
}

private fun returnILoveRecursion(countOfLines: Byte): String {
    if (countOfLines.toInt() == 0)
        return ""
    return "I love Recursion\n" + returnILoveRecursion((countOfLines - 1).toByte())
}