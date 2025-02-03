package _1_learn._1_1_basics._1_1_18_escape_sequences

/* √ Escape Sequences = Escape Characters */
fun main() {
    val normalText = "Native Android Developer"
    val withNewLine = "Native(\n)Android Developer"
    val withBackSpace = "Native(\b)Android Developer"
    val withTab = "Native(\t)Android Developer"
    val withCarriageReturn = "Native(\r)Android Developer"
    val withDoubleQuotationMark = "Native(\")Android Developer"
    val withBackSlash = "Native(\\)Android Developer"

    println("-----(normalText)-----")
    println(normalText)
    println("\n-----(withNewLine)-----")
    println(withNewLine)
    println("\n-----(withBackSpace)-----")
    println(withBackSpace)
    println("\n-----(withTab)-----")
    println(withTab)
    println("\n-----(withCarriageReturn)-----")
    println(withCarriageReturn)
    println("\n-----(withDoubleQuotationMark)-----")
    println(withDoubleQuotationMark)
    println("\n-----(withBackSlash)-----")
    print(withBackSlash)
}