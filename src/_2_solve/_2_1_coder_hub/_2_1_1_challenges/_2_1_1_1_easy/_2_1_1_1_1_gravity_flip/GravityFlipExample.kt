package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_1_gravity_flip

fun main() {
    println(getGravityFlip(mutableListOf(3, 2, 1, 2)))
    println(getGravityFlip(mutableListOf(2, 3, 8)))
    println(getGravityFlip(mutableListOf(1, 1, 1, 1)))
    print(getGravityFlip(mutableListOf(4, 5, 6, 3, 2)))
}

private fun getGravityFlip(numbers: MutableList<Int>): MutableList<Int> {
    numbers.sort()
    return numbers
}