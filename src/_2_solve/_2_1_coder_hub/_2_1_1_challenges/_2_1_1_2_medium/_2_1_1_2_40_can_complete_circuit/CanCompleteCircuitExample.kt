package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_40_can_complete_circuit

fun main() {
    println(
        canCompleteCircuit(
            mutableListOf(1, 2, 3, 4, 3),
            mutableListOf(3, 4, 5, 1, 1)
        )
    )
    println(
        canCompleteCircuit(
            mutableListOf(2, 3, 4),
            mutableListOf(3, 4, 3)
        )
    )
    println(
        canCompleteCircuit(
            mutableListOf(5, 1, 2, 3, 4),
            mutableListOf(4, 4, 1, 5, 1)
        )
    )
    print(
        canCompleteCircuit(
            mutableListOf(1, 2, 3, 4),
            mutableListOf(4, 4, 4, 4)
        )
    )
}

private fun canCompleteCircuit(gas: MutableList<Int>, cost: MutableList<Int>): Int {
    var total = 0
    var tank = 0
    var start = 0
    for (index in gas.indices) {
        val difference = gas[index] - cost[index]
        total += difference
        tank += difference
        if (tank < 0) {
            start = index + 1
            tank = 0
        }
    }
    return if (total < 0)
        -1
    else
        start
}