package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_e_base_conversion

fun main() {
    val countOfCases = readln().toShort()
    repeat(countOfCases.toInt()) {
        val decimalValue = readln().toInt()
        println(convertFromDecimalToBinary(decimalValue))
    }
}

private fun convertFromDecimalToBinary(decimalValue: Int): String {
    if (decimalValue == 0)
        return "0"
    return convertToBinary(decimalValue)
}

private fun convertToBinary(decimalValue: Int): String {
    if (decimalValue == 0)
        return ""
    return convertToBinary((decimalValue / 2)) + (decimalValue % 2).toString()
}