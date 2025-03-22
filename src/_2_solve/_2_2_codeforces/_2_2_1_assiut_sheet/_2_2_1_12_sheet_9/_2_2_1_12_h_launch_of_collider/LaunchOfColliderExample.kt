package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_12_sheet_9._2_2_1_12_h_launch_of_collider

fun main() {
    val particleCount = readln().toInt()
    val movementDirections = readln()
    val particlePositions = readln()
        .split(' ')
        .map { it.toInt() }

    var earliestCollisionTime = Int.MAX_VALUE

    for (index in 0..<particleCount - 1)
        if (
            movementDirections[index] == 'R' &&
            movementDirections[index + 1] == 'L'
        ) {
            val collisionTime = (particlePositions[index + 1] - particlePositions[index]) / 2
            earliestCollisionTime = earliestCollisionTime.coerceAtMost(collisionTime)
        }

    print(
        if (earliestCollisionTime == Int.MAX_VALUE)
            -1
        else
            earliestCollisionTime
    )
}