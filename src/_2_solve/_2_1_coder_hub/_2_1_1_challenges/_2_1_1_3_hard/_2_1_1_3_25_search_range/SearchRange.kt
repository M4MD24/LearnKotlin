package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_25_search_range

fun searchRange(nums: MutableList<Int>, target: Int): MutableList<Int> {
    fun findFirst(): Int {
        var left = 0
        var right = nums.size - 1
        var result = -1
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] < target -> left = mid + 1
                nums[mid] > target -> right = mid - 1
                else -> {
                    result = mid
                    right = mid - 1
                }
            }
        }
        return result
    }

    fun findLast(): Int {
        var left = 0
        var right = nums.size - 1
        var result = -1
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] < target -> left = mid + 1
                nums[mid] > target -> right = mid - 1
                else -> {
                    result = mid
                    left = mid + 1
                }
            }
        }
        return result
    }
    return mutableListOf(findFirst(), findLast())
}

fun main() {
    val testCases = listOf(
        mutableListOf(5, 7, 7, 8, 8, 10) to 8,
        mutableListOf(5, 7, 7, 8, 8, 10) to 6,
        mutableListOf<Int>() to 0,
        mutableListOf(1) to 1
    )
    for ((nums, target) in testCases) {
        println(searchRange(nums, target))
    }
}