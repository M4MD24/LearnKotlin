package _1_learn._1_1_basics._1_1_7_operators._1_1_7_6_assignment_operators

fun main() {
    /* Assignment Operators Types! */
    /* ( = ) Assignment
     * ( += ) Addition Assignment
     * ( -= ) Subtraction Assignment
     * ( *= ) Multiplication Assignment
     * ( /= ) Division Assignment
     * ( %= ) Modulus Assignment
     * ( &= ) Bitwise AND Assignment
     * ( |= ) Bitwise OR Assignment
     * ( ^= ) Bitwise XOR Assignment
     * ( >>= ) Right Shift Assignment
     * ( <<= ) Left Shift Assignment
     * */

    val number = 3

    // Assignment
    var assignment = 10
    assignment = number // Assignment
    println("Assignment = $assignment")

    var assignment2 = 10
    var assignment3 = 20
    assignment3 = number
    assignment2 = assignment3 // Assignment
    println("Assignment2 = $assignment2\nAssignment3 = $assignment3")

    // Addition Assignment
    var additionAssignment = 10
    additionAssignment += number // Addition Assignment ( additionAssignment = additionAssignment + number )
    println("Addition Assignment = $additionAssignment")

    // Subtraction Assignment
    var subtractionAssignment = 10
    subtractionAssignment -= number // Subtraction Assignment ( subtractionAssignment = subtractionAssignment - number )
    println("Subtraction Assignment = $subtractionAssignment")

    // Multiplication Assignment
    var multiplicationAssignment = 10
    multiplicationAssignment *= number // Multiplication Assignment ( multiplicationAssignment = multiplicationAssignment * number )
    println("Multiplication Assignment = $multiplicationAssignment")

    // Division Assignment
    var divisionAssignment = 10
    divisionAssignment /= number // Division Assignment ( divisionAssignment = divisionAssignment / number )
    println("Division Assignment = $divisionAssignment")

    // Modulus Assignment
    var modulusAssignment = 10
    modulusAssignment %= number // Modulus Assignment ( modulusAssignment = modulusAssignment % number )
    println("Modulus Assignment = $modulusAssignment")

    /* AND Assignment: Performs a bitwise AND operation and assigns the result to 'andAssignment'. */
    var andAssignment = 10
    andAssignment = andAssignment and number // AND Assignment ( andAssignment = andAssignment & number )
    println("Bitwise AND Assignment = $andAssignment")

    /* OR Assignment: Performs a bitwise OR operation and assigns the result to 'orAssignment'. */
    var orAssignment = 10
    orAssignment = orAssignment or number // OR Assignment ( orAssignment = orAssignment | number )
    println("Bitwise OR Assignment = $orAssignment")

    /* XOR Assignment: Performs a bitwise XOR operation and assigns the result to 'xorAssignment'. */
    var xorAssignment = 10
    xorAssignment = xorAssignment xor number // XOR Assignment ( xorAssignment = xorAssignment ^ number )
    println("Bitwise XOR Assignment = $xorAssignment")

    /* Right Shift Assignment: Shifts the bits of 'rightShiftAssignment' to the right by 'number' positions and assigns the result to 'rightShiftAssignment'. */
    var rightShiftAssignment = 10
    rightShiftAssignment = rightShiftAssignment shr number // Right Shift Assignment ( rightShiftAssignment = rightShiftAssignment >> number )
    println("Right Shift Assignment = $rightShiftAssignment")

    /* Left Shift Assignment: Shifts the bits of 'leftShiftAssignment' to the left by 'number' positions and assigns the result to 'leftShiftAssignment'. */
    var leftShiftAssignment = 10
    leftShiftAssignment = leftShiftAssignment shl number // Left Shift Assignment ( leftShiftAssignment = leftShiftAssignment << number )
    print("Left Shift Assignment = $leftShiftAssignment")
}