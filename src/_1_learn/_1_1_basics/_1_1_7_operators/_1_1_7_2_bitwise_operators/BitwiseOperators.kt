package _1_learn._1_1_basics._1_1_7_operators._1_1_7_2_bitwise_operators

fun main() {
    /* √ XOR = Exclusive OR */

    /* Bitwise Operators Types! */
    /* ( ~ ) Bitwise Complement
     * ( << ) Left Shift
     * ( >> ) Right Shift
     * ( >>> ) Unsigned Right Shift
     * ( & ) Bitwise AND
     * ( | ) Bitwise OR
     * ( ^ ) Bitwise XOR
     * */

    val number1 = 5
    val number2 = 10

    println("Bitwise Complement " + number1.inv()) // Bitwise Complement

    println("Left Shift = " + (number1 shl number2)) // Left Shift

    println("Right Shift = " + (number1 shr number2)) // Right Shift

    println("Unsigned Right Shift = " + (number1 ushr number2)) // Unsigned Right Shift

    println("Bitwise AND = " + (number1 and number2)) // Bitwise AND

    /* ■ AND Table
        ---------------
        | - | - | AND |
        ---------------
        | T | T |  T  |
        | T | F |  F  |
        | F | T |  F  |
        | F | F |  F  |
        ---------------
    */
    println("Bitwise OR = " + (number1 or number2)) // Bitwise OR

    /* ■ OR Table
        ---------------
        | - | - |  OR |
        ---------------
        | T | T |  T  |
        | T | F |  T  |
        | F | T |  T  |
        | F | F |  F  |
        ---------------
    */
    println("Bitwise XOR = " + (number1 xor number2)) // Bitwise XOR
    /* ■ XOR Table
        ---------------
        | - | - | XOR |
        ---------------
        | T | T |  F  |
        | T | F |  T  |
        | F | T |  T  |
        | F | F |  F  |
        ---------------
    */
}