package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_10

class Product(
    val name: String,
    private val price: Double,
    private val quantity: Long
) {
    fun totalCostOfProduct() = quantity * price
}