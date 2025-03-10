package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_9_sheet_6._2_2_1_9_a_power_of_two

fun main() {
    val targetNumber = readln().toLong()
    print(isPowerOfTwo(targetNumber))
}

private fun isPowerOfTwo(targetNumber: Long) = if (
    targetNumber > 0 &&
    (targetNumber and (targetNumber - 1)) == 0L
)
    "YES"
else
    "NO"