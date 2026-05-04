package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_27_most_active_dev

fun mostActiveDev(authors: MutableList<String>): String {
    if (authors.isEmpty())
        return ""
    val frequency = authors.groupingBy { it }
        .eachCount()
    return frequency.maxWithOrNull(
        compareBy(
            { it.value },
            { -it.key.hashCode() }
        )
    )?.key ?: ""
}

fun main() {
    val testCases = listOf(
        mutableListOf("Ali", "Sara", "Ali"),
        mutableListOf("Dev1", "Dev2", "Dev2", "Dev1"),
        mutableListOf("x"),
        mutableListOf()
    )
    for (testCase in testCases)
        println(mostActiveDev(testCase))
}