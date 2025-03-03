package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_8_sheet_5._2_2_1_8_c_wonderful_number

fun main() {
    val number = readln().toInt()
    print(isWonderful(number))
}

private fun isWonderful(number: Int): String {
    if (number % 2 == 0)
        return "NO"
    val binaryNumber = StringBuffer(number.toString(2))
    val reversedText = StringBuffer(binaryNumber).reverse()
    val middleLength = binaryNumber.length / 2
    return if (binaryNumber.substring(
            0,
            middleLength
        ) == reversedText.substring(
            0,
            middleLength
        )
    )
        "YES"
    else
        "NO"
}