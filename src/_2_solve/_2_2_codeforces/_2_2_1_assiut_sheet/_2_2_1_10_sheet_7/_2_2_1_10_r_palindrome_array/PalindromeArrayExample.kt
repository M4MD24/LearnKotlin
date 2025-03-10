package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_10_sheet_7._2_2_1_10_r_palindrome_array

fun main() {
    val countOfNumbers = readln().toInt()
    val numbers = readln()
        .split(' ')
        .map { it.toInt() }
    print(
        if (isPalindrome(numbers))
            "YES"
        else
            "NO"
    )
}

private fun isPalindrome(
    numbers: List<Int>,
    leftIndex: Int = numbers.size - 1,
    rightIndex: Int = 0,
    lengthMiddle: Int = leftIndex / 2,
): Boolean {
    if (rightIndex >= leftIndex)
        return true
    if (numbers[rightIndex] != numbers[leftIndex])
        return false
    return isPalindrome(
        numbers,
        leftIndex - 1,
        rightIndex + 1,
        lengthMiddle
    )
}

// >
/*
private fun isPalindrome(
    numbers: List<Int>,
    leftIndex: Int = numbers.size - 1,
    rightIndex: Int = 0,
    lengthMiddle: Int = leftIndex / 2,
): Boolean = if (rightIndex < leftIndex) {
    if (numbers[rightIndex] == numbers[leftIndex])
        isPalindrome(
            numbers,
            leftIndex - 1,
            rightIndex + 1,
            lengthMiddle
        )
    else
        false
} else
    true
*/