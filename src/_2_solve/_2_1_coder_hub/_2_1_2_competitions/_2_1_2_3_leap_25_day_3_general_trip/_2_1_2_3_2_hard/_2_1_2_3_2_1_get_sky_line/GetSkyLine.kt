package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_3_leap_25_day_3_general_trip._2_1_2_3_2_hard._2_1_2_3_2_1_get_sky_line

fun main() {
    println(getSkyline(listOf(2, 9, 10, 3, 7, 15, 5, 12, 12, 15, 20, 10, 19, 24, 8)))
    println(getSkyline(listOf(0, 2, 3, 2, 5, 3)))
    println(getSkyline(listOf(1, 2, 1, 1, 2, 2, 1, 2, 3)))
    print(getSkyline(listOf(1, 3, 3, 2, 4, 4, 5, 6, 1)))
}

fun getSkyline(buildingData: List<Int>): MutableList<Int> {
    val keyPoints = mutableListOf<Pair<Int, Int>>()

    for (index in buildingData.indices step 3) {
        keyPoints.add(Pair(buildingData[index], -buildingData[index + 2]))
        keyPoints.add(Pair(buildingData[index + 1], buildingData[index + 2]))
    }

    keyPoints.sortWith(compareBy({ it.first }, { it.second }))

    val skyline = mutableListOf<Int>()
    val heightMap = java.util.TreeMap<Int, Int>().apply { put(0, 1) }
    var previousMaximumHeight = 0

    for ((position, height) in keyPoints) {
        if (height < 0)
            heightMap[-height] = heightMap.getOrDefault(-height, 0) + 1
        else
            heightMap[height]?.let {
                if (it == 1)
                    heightMap.remove(height)
                else
                    heightMap[height] = it - 1
            }
        val currentMaximumHeight = heightMap.lastKey()
        if (currentMaximumHeight != previousMaximumHeight) {
            skyline.add(position)
            skyline.add(currentMaximumHeight)
            previousMaximumHeight = currentMaximumHeight
        }
    }

    return skyline
}