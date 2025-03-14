package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_n_convert_to_base

fun main() {
    val conversionType = readln().toByte()
    val line = readln().split(' ')
    val value = line[0]
    val base = line[1].toByte()
    print(
        if (conversionType == 1.toByte())
            convertFromAnyToDecimal(value, base)
        else
            convertFromDecimalToAny(value, base)
    )
}

private fun convertFromAnyToDecimal(
    value: String,
    base: Byte
) = value.toLong(base.toInt())

private fun convertFromDecimalToAny(
    value: String,
    base: Byte
) = value.toLong().toString(base.toInt()).uppercase()