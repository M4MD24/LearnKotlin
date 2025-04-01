package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_2_control_flow._2_3_1_1_2_1

/**
 * Write a Kotlin program to check if a given number is positive, negative, or zero.
 * */

fun main() {
    print("Enter Number: ")
    val number = readln().toInt()
    print(
        "Number status: " +
                if (number == 0)
                    "Zero"
                else if (number > 0)
                    "Positive"
                else
                    "Negative"
    )
}