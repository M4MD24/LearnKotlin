package _1_learn._1_1_basics._1_1_7_operators._1_1_7_4_logical_operators

fun main() {
    /* Logical Operators Types! */
    /* ( && ) Logical AND
     * ( || ) Logical OR
     * ( ! ) Logical NOT
     * */

// Logical AND

    val logical_AND_T_T = true && true
    println("Logical AND T_T = $logical_AND_T_T")

    val logical_AND_T_F = true && false
    println("Logical AND T_F = $logical_AND_T_F")

    val logical_AND_F_T = false && true
    println("Logical AND F_T = $logical_AND_F_T")

    val logical_AND_F_F = false && false
    println("Logical AND F_F = $logical_AND_F_F\n")

    /* AND Table
        ---------------
        | - | - | AND |
        ---------------
        | T | T |  T  |
        | T | F |  F  |
        | F | T |  F  |
        | F | F |  F  |
        ---------------
    */

// Logical OR
    val logical_OR_T_T = true || true
    println("Logical OR T_T = $logical_OR_T_T")

    val logical_OR_T_F = true || false
    println("Logical OR T_F = $logical_OR_T_F")

    val logical_OR_F_T = false || true
    println("Logical OR F_T = $logical_OR_F_T")

    val logical_OR_F_F = false || false
    println("Logical OR F_F = $logical_OR_F_F\n")

    /* OR Table
        ---------------
        | - | - |  OR |
        ---------------
        | T | T |  T  |
        | T | F |  T  |
        | F | T |  T  |
        | F | F |  F  |
        ---------------
    */

// Logical NOT
    val logical_NOT_T = !true
    println("Logical NOT T = $logical_NOT_T")

    val logical_NOT_F = !false
    println("Logical NOT F = $logical_NOT_F")
    /* ■ NOT Table
        -----------
        | 1 | NOT |
        -----------
        | T |  F  |
        | F |  T  |
        -----------
    */
}