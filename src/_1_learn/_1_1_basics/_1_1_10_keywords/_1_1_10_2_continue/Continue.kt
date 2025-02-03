package _1_learn._1_1_basics._1_1_10_keywords._1_1_10_2_continue

fun main() {
    val number = 5
    var index = 0
    val stopIn = 10

    while (index <= stopIn) {
        println(index)
        ++index
        if (index == number)
            continue  /* Skips the current iteration of a loop! */
        println("-")
    }
}