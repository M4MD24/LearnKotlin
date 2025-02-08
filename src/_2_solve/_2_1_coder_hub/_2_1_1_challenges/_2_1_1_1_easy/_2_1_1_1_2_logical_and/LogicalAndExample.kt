package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_2_logical_and

fun main() = print(logicalAnd(readln().toBoolean(), readln().toBoolean()))

private fun logicalAnd(firstStatus: Boolean, secondStatus: Boolean) = firstStatus && secondStatus