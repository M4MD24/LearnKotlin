package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_q_digits

fun main() {
    val countOfValues = readln().toByte()
    repeat(countOfValues.toInt()) {
        val value = readln()
        println(
            value.reversed()
                .toCharArray()
                .joinToString(" ")
        )
    }
}