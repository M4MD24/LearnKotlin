package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_5_sheet_3._2_2_1_5_o_fibonacci

fun main() = println(getFibonacci(readln().toByte()))

private fun getFibonacci(number: Byte): Long {
    var previousNumber = 0L
    var currentNumber = 1L
    repeat(number - 1) {
        currentNumber += previousNumber.also {
            previousNumber = currentNumber
        }
    }
    return previousNumber
}

// >
/*
fun main() = print(getFibonacci((readln().toByte() - 1).toByte()))

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
*/