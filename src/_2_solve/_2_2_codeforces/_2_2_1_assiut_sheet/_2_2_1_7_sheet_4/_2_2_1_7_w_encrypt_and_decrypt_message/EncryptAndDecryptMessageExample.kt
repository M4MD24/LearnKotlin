package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_w_encrypt_and_decrypt_message

const val ENCRYPT_TEXT = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/"
const val DECRYPT_TEXT = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

fun main() {
    val operator = readln().toByte()
    val characters = if (operator == 1.toByte())
        DECRYPT_TEXT
            .zip(ENCRYPT_TEXT)
            .toMap()
    else
        ENCRYPT_TEXT
            .zip(DECRYPT_TEXT)
            .toMap()
    val text = readln()
    print(
        text
            .map { characters[it] ?: it }
            .joinToString("")
    )
}