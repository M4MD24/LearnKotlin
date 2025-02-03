package _1_learn._1_1_basics._1_1_10_keywords._1_1_10_1_break

fun main() {
    val number = 5
    var index = 0

    while (true) {
        println(index)
        ++index
        if (number == index) {
            println("$number Done Stopped")
            break /* Stops all blocks with break in them! */
        }
    }
}