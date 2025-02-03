package _1_learn._1_1_basics._1_1_6_literal

fun main() {
    val hexadecimalValue = 0xF // (F) In Hexadecimal = 15
    val decimalValue = 15L // (15) In Decimal = 15
    /* Octal not supported in Kotlin! */
    val binaryValue = 0b1111 // (1111) In Binary = 15
    val binaryValue2 = 0b1111 // (1111) In Binary = 15
    val binaryValue3 = 0b1111 // (1111) In Binary = 15

    /* Not important Use int, You can use any data type of number! */

    print(
        """
            $hexadecimalValue
            $decimalValue
            $binaryValue
            $binaryValue2
            $binaryValue3
        """.trimIndent()
    )
}