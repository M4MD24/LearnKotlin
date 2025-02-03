package _1_learn._1_1_basics._1_1_7_operators._1_1_7_3_relational_operators

fun main() {
    /* √ Relational Operators = Comparison Operators */

    /* Relational Operators Types! */
    /* ( == ) Equal to
     * ( != ) Not equal to
     * ( > ) Greater than
     * ( < ) Less than
     * ( >= ) Greater than or equal to
     * ( <= ) Less than or equal to
     * */

    val number1 = 3
    val number2 = 3.5f

    val equalTo = number1.toFloat() == number2 // Equal to = (false)
    println("Equal to = $equalTo")

    val notEqualTo = number1.toFloat() != number2 // Not equal to = (true)
    println("Not equal to = $notEqualTo")

    val greaterThan = number1 > number2 // Greater than = (false)
    println("Greater than = $greaterThan")

    val lessThan = number1 < number2 // Less than = (true)
    println("Less than = $lessThan")

    val greaterThanOrEqualTo = number1 >= number2 // Greater than or equal to = (false)
    println("Greater than or equal to = $greaterThanOrEqualTo")

    val lessThanOrEqualTo = number1 <= number2 // Less than or equal to = (true)
    println("Less than or equal to = $lessThanOrEqualTo")
}