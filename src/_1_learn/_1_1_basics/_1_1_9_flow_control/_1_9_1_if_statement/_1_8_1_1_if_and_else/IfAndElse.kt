package _1_learn._1_1_basics._1_1_9_flow_control._1_9_1_if_statement._1_8_1_1_if_and_else

fun main() {
    val number1 = 10
    val number2 = 3
    val number3 = 10
    val number4 = 20

    //        With Shorthand = without curly brackets '{ }'
    if (number1 > number2) println("if with shorthand: Done")
    else if (number1 > number2) println("else if with shorthand: Done")
    else println("else with shorthand: Done")

    //        Without Shorthand = with curly brackets '{ }'
    if (number1 > number2) {
        println("if without shorthand: Done")
    } else if (number1 > number2) {
        println("else if without shorthand: Done")
    } else {
        println("else without shorthand: Done")
    }

    if ((number1 > number2) && (number3 < number4)) {
        println("if: Done with AND")
    } else if ((number1 > number2) && (number3 < number4)) {
        println("else if: Done with AND")
    } else {
        println("else: Done with AND")
    }

    if ((number1 > number2) || (number3 == number4)) {
        println("if: Done with OR")
    } else if ((number1 > number2) || (number3 == number4)) {
        println("else if: Done with OR")
    } else {
        println("else: Done with OR")
    }

    if ((number1 > number2) xor (number3 == number4)) {
        println("if: Done with XOR")
    } else if ((number1 > number2) xor (number3 == number4)) {
        println("else if: Done with XOR")
    } else {
        println("else: Done with XOR")
    }

    if ((number1 > number2) and (number3 < number4)) {
        println("if: Done with AND")
    } else if ((number1 > number2) and (number3 < number4)) {
        println("else if: Done with AND")
    } else {
        println("else: Done with AND")
    }

    if ((number1 > number2) or (number3 == number4)) {
        println("if: Done with OR")
    } else if ((number1 > number2) or (number3 == number4)) {
        println("else if: Done with OR")
    } else {
        println("else: Done with OR")
    }
}