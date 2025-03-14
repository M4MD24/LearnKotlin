package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_o_fibonacci

fun main() {
    val number = readln().toByte()
    print(getFibonacci(number))
}

private fun getFibonacci(number: Byte): Long = if (number <= 2)
    number - 1L
else
    getFibonacci((number - 1).toByte()) +
            getFibonacci((number - 2).toByte())