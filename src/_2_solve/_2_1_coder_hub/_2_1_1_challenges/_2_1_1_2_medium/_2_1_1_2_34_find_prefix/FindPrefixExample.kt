package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_34_find_prefix

fun main() {
    println(findPrefix(mutableListOf("Nouf", "Abdullah"), "Gh"))
    println(findPrefix(mutableListOf("Reassemble", "Remainder", "Room", "Receive"), "re"))
    println(findPrefix(mutableListOf("Compared", "Coding", "Career", "Coderhub", "Cold", "Call"), "co"))
    print(findPrefix(mutableListOf("Save", "Saudi", "Satr", "Send", "Salt", "Super", "Sample"), "sa"))
}

private fun findPrefix(words: MutableList<String>, text: String) = words
    .filter {
        it.startsWith(
            text,
            true
        )
    }
    .toMutableList()
    .ifEmpty { mutableListOf("No matches found") }