package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_72_can_form

fun main() {
    println(canForm("Hubcoders", "coderhub"))
    println(canForm("SATR", "satr"))
    println(canForm("programmer", "programming"))
    print(canForm("worldhello", "hello"))
}

private fun canForm(sourceText: String, targetText: String): String {
    val sourceTextAsStringBuilder = StringBuilder(sourceText.lowercase())
    val targetTextAsStringBuilder = StringBuilder(targetText.lowercase())
    var indexOfSourceText = 0
    var maximumIndexOfSourceText = sourceTextAsStringBuilder.length
    while (
        targetTextAsStringBuilder.isNotEmpty() &&
        indexOfSourceText < maximumIndexOfSourceText
    ) {
        val characterOfSourceText = sourceTextAsStringBuilder[indexOfSourceText]
        val characterOfTargetText = targetTextAsStringBuilder[0]
        if (characterOfSourceText == characterOfTargetText) {
            targetTextAsStringBuilder.deleteCharAt(0)
            sourceTextAsStringBuilder.deleteCharAt(indexOfSourceText)
            indexOfSourceText = 0
            maximumIndexOfSourceText--
        } else indexOfSourceText++
    }
    return if (targetTextAsStringBuilder.isEmpty()) "yes"
    else "no"
}