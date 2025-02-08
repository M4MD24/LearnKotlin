package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_67_hashtag_it

fun main() {
    println(getTextsAfterHashtag(mutableListOf("stay_home", "coronavirus", "Saudi_Arabia")))
    println(getTextsAfterHashtag(mutableListOf("Vibes", "SAFCSP", "entrepreneur")))
    println(getTextsAfterHashtag(mutableListOf("SAFCSP", "SAUDI_ARABIA", "Riyadh")))
    print(getTextsAfterHashtag(mutableListOf("Programming", "Code")))
}

private fun getTextsAfterHashtag(texts: MutableList<String>): String {
    val textsAfterHashing = StringBuilder()
    for (index in texts.indices) {
        textsAfterHashing.append('#')
            .append(texts[index])
        if (index != texts.size - 1)
            textsAfterHashing.append(' ')
    }
    return textsAfterHashing.toString()
}