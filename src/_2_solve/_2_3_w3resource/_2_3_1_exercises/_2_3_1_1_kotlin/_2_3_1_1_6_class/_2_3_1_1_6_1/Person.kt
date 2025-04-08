package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_1

class Person(
    private val name: String,
    private val age: Short,
    private val country: String
) {
    fun printDetails() = print(
        """
            Name: $name
            Age: $age
            Country: $country""".trimIndent()
    )
}