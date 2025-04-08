package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_3

class Car(
    private val make: String,
    private val model: String,
    private val year: Short
) {
    fun printDetails() = print(
        """
            Make: $make
            Model: $model
            Year: $year""".trimIndent()
    )
}