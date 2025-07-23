package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_19_maximum_irrigation_period

fun main() {
    println(maximumIrrigationPeriod(mutableListOf(1, 2, 3, 4, 5), 5))
    println(maximumIrrigationPeriod(mutableListOf(2, 2, 2), 3))
    println(maximumIrrigationPeriod(mutableListOf(1, 1, 1, 1), 3))
    print(maximumIrrigationPeriod(mutableListOf(), 5))
}

fun maximumIrrigationPeriod(
    irrigation : MutableList<Int>,
    water : Int
) : Int {
    if (
        irrigation.count() == 0 ||
        water == 0
    )
        return 0
    var count = 0
    var water = water
    for (irrigation in irrigation) {
        if (water - irrigation < 0)
            return count
        water -= irrigation
        count++
    }
    return count
}