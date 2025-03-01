package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_h_good_or_bad

fun main() {
    val countOfValues = readln().toShort()
    repeat(countOfValues.toInt()) {
        val binarySystemValue = readln()
        println(
            if (
                "010" in binarySystemValue ||
                "101" in binarySystemValue
            )
                "Good"
            else
                "Bad"
        )
    }
}