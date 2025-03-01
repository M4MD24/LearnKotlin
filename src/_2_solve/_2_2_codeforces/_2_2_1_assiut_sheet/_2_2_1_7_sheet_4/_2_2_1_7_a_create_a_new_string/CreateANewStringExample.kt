package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_a_create_a_new_string

fun main() {
    val firstText = readln()
    val secondText = readln()
    val texts = "$firstText $secondText"
    print(
        """
        ${firstText.length} ${secondText.length}
        $texts""".trimIndent()
    )
}