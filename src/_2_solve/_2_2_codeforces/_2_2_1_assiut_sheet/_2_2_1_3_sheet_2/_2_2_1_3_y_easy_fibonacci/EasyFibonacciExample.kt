package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_3_sheet_2._2_2_1_3_y_easy_fibonacci

fun main() {
    val targetNumber = readln().toByte()
    print(
        (0..<targetNumber)
            .joinToString(" ")
            { getFibonacci(it.toByte()).toString() }
    )
}

private fun getFibonacci(
    targetNumber: Byte,
    cache: MutableMap<Int, Long> = mutableMapOf()
): Long {
    return if (targetNumber <= 1)
        targetNumber.toLong()
    else
        cache.getOrPut(targetNumber.toInt()) {
            getFibonacci(
                (targetNumber - 1).toByte(),
                cache
            ) + getFibonacci(
                (targetNumber - 2).toByte(),
                cache
            )
        }
}