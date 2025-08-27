package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_1_easy._2_1_1_1_80_can_jump

fun main() {
    println(
        canJump(
            mutableListOf(2, 3, 1, 1, 4)
        )
    )
    println(
        canJump(
            mutableListOf(3, 2, 1, 0, 4)
        )
    )
    println(
        canJump(
            mutableListOf(0)
        )
    )
    print(
        canJump(
            mutableListOf(2, 0, 0)
        )
    )
}

private fun canJump(jumps : MutableList<Int>) : Boolean {
    var farthest = 0
    for (index in jumps.indices) {
        if (index > farthest)
            return false
        farthest = farthest.coerceAtLeast(index + jumps[index])
        if (farthest >= jumps.size - 1)
            return true
    }
    return true
}