package _1_learn._1_1_basics._1_1_7_operators._1_1_7_1_arithmetic_operators

fun main() {
    /* √
     * Prefix = Pre
     * Postfix = Post */

    /* Arithmetic Operators Types! */
    /* ( + ) Addition
     * ( - ) Subtraction
     * ( * ) Multiplication
     * ( / ) Division
     * ( % ) Modulus
     * ( ++ ) Increment
     * ( -- ) Decrement
     * */

    var number1 = 10
    var number2 = 3

    println("Addition = " + (number1 + number2)) //  Addition
    println("Subtraction = " + (number1 - number2)) //  Subtraction
    println("Multiplication = " + (number1 * number2)) //  Multiplication
    println("Division = " + number1.toFloat() / number2) //  Division
    println("Modulus = " + (number1 % number2)) //  Modulus

    // Increment
    println("Prefix Increment = " + ++number1) // Prefix Increment
    println("Postfix Increment = " + number1++) // Postfix Increment

    // Decrement
    println("Prefix Decrement = " + --number2) // Prefix Decrement
    println("Postfix Decrement = " + number2--) // Postfix Decrement
}