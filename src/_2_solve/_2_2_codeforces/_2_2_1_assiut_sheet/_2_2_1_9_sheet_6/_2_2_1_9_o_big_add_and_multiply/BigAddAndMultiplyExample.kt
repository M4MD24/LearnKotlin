package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_o_big_add_and_multiply

import java.math.BigInteger

fun main() {
    val firstNumber = BigInteger(readln())
    val secondNumber = BigInteger("9999")
    print(
        """
        ${firstNumber.add(secondNumber)}
        ${firstNumber.multiply(secondNumber)}""".trimIndent()
    )
}