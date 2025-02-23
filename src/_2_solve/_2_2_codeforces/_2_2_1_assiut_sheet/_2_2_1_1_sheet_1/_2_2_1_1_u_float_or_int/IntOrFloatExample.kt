package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_1_sheet_1._2_2_1_1_u_float_or_int

fun main() {
    val number = readln().toFloat()
    print(isIntOrFloat(number))
}

private fun isIntOrFloat(number: Float): String {
    val intNumber = number.toInt()
    return if (number == intNumber.toFloat())
        "int $intNumber"
    else
        "float " + intNumber + " " + (number - intNumber)
}