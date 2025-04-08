package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_4

class Student(
    val name: String,
    private val age: Short,
    private val grade: Float
) {
    fun isEligibleForPromotion() = grade >= 90
}