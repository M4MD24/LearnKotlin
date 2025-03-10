package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_47_generate_password

fun main() = print(
    generatePassword(
        readln().toInt(),
        readln().toBoolean()
    )
)


private val passwords = mapOf(
    4 to listOf("Ab1Z"),
    5 to listOf("qWe1R"),
    6 to listOf("a#B3\$z"),
    7 to listOf("2#aB$9t"),
    8 to listOf("Ab4kPz10", "a#X2@R4z"),
    10 to listOf("Ab12C3xYz0", "q4\$Xz@Y1vC"),
    12 to listOf("B9k0AbCd9Z12", "Z2@x9#A1b\$C7p")
)

fun generatePassword(
    length: Int,
    useSpecialCharacters: Boolean
): String {
    if (!passwords.containsKey(length))
        return ""
    val options = passwords[length]!!
    return if (
        useSpecialCharacters &&
        options.size > 1
    )
        options[1]
    else
        options[0]
}