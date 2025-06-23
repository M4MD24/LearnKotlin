package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_52_first_unique_character

fun main() {
    print(
        firstUniqueCharacter(
            "loveleetcode"
        )
    )
}

private fun firstUniqueCharacter(
    text : String
) : Int {
    val characterCount = linkedMapOf<Char, Int>()
    text.forEachIndexed { index, character ->
        characterCount[character] = if (characterCount.containsKey(character))
            -1
        else
            index
    }
    return characterCount.values.firstOrNull { it != -1 } ?: -1
}