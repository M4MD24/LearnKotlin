package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_d_strings

fun main() {
    val firstText = readln()
    val secondText = readln()
    val texts = firstText + secondText
    val swappedFirstText = firstText swapFirstCharacter secondText
    val swappedSecondText = secondText swapFirstCharacter firstText
    print(
        """
        ${firstText.length} ${secondText.length}
        $texts
        $swappedFirstText $swappedSecondText""".trimIndent()
    )
}

private infix fun String.swapFirstCharacter(targetText: String) = targetText[0] + this.substring(1)