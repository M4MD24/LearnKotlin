package _1_learn._1_3_object_oriented_programming._1_3_3_overloading_method

fun main() {
    printNumbers(10, 20)
    printNumbers(10, 20, 30)
}

private fun printNumbers(NUMBER_1: Int, NUMBER_2: Int) {
    println("Print 2 Numbers: $NUMBER_1, $NUMBER_2")
}

private fun printNumbers(NUMBER_1: Int, NUMBER_2: Int, NUMBER_3: Int) { // Overloading Method
    println("Print 3 Numbers: $NUMBER_1, $NUMBER_2, $NUMBER_3")
}
