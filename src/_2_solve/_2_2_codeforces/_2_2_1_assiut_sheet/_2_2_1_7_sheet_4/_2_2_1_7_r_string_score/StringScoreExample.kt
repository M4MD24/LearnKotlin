package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_7_sheet_4._2_2_1_7_r_string_score

fun main() {
    val countOfTextLetters = readln().toInt()
    val text = readln()
    print(getScore(text))
}

private enum class Letters(val character: Char) {
    V('V'),
    W('W'),
    X('X'),
    Y('Y'),
    Z('Z');
}

private fun getScore(text: String): Int {
    val characters = ArrayDeque(text.toList())
    var score = 0
    while (characters.isNotEmpty())
        when (val currentCharacter = characters.removeFirst()) {
            Letters.V.character -> score += 5

            Letters.W.character -> score += 2

            Letters.X.character -> if (characters.isNotEmpty())
                characters.removeFirst()

            Letters.Y.character -> if (characters.isNotEmpty()) {
                val nextCharacter = characters.removeFirst()
                characters.addLast(nextCharacter)
            }

            Letters.Z.character -> if (characters.isNotEmpty())
                when (val nextCharacter = characters.first()) {
                    Letters.V.character -> {
                        score /= 5
                        characters.removeFirst()
                    }

                    Letters.W.character -> {
                        score /= 2
                        characters.removeFirst()
                    }
                }
        }
    return score
}