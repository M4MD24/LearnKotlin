package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_4_is_interleave

fun main() = print(
    isInterleave(
        readln(),
        readln(),
        readln()
    )
)

private fun isInterleave(
    firstText: String,
    secondText: String,
    thirdText: String
) = (firstText + secondText)
    .chars()
    .sorted()
    .toArray()!!
    .contentEquals(
        thirdText.chars()
            .sorted()
            .toArray()
    )