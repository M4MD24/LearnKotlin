package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_54_remove_repeated_words

fun main() = print(
    removeRepeatedWords(
        "Sam went went to to to his business"
    )
)

private fun removeRepeatedWords(text : String) : String = text.split(Regex("\\s+"))
    .fold(mutableListOf<String>()) { accumulator, word ->
        if (
            accumulator.isEmpty() ||
            !accumulator.last()
                .equals(
                    word,
                    true
                )
        )
            accumulator.add(word)
        accumulator
    }.joinToString(" ")