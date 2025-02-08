package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_66_count_down_by_three

fun main() = print(getEvenNumbersWithCountDownByThree(readln().toInt()))

private fun getEvenNumbersWithCountDownByThree(startNumber: Int) = if (startNumber <= 3)
    mutableListOf(0)
else
    (startNumber - 3 downTo 2 step 3)
        .filter { it % 2 == 0 }
        .sorted()
        .toMutableList()