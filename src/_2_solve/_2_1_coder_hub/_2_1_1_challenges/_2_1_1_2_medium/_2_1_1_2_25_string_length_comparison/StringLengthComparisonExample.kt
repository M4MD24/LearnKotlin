package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_25_string_length_comparison

fun main() {
    println(getStringLengthComparison(mutableListOf("A", "B")))
    println(getStringLengthComparison(mutableListOf("Khalid", "Sultan", "AlDana", "Johrah", "Ghadah")))
    println(getStringLengthComparison(mutableListOf("Satr", "CoderHub")))
    print(getStringLengthComparison(mutableListOf("123", "456", "789")))
}

private fun getStringLengthComparison(texts: MutableList<String>): Boolean {
    return texts.size > 1 &&
            texts.map { it.length }
                .distinct()
                .count() == 1
}