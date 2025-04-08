package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_8

class Employee(
    private val name: String,
    private val age: Short,
    private val designation: String
) {
    fun printDetails() = print(
        """
        Name: $name
        Age: $age
        Designation: $designation""".trimIndent()
    )
}