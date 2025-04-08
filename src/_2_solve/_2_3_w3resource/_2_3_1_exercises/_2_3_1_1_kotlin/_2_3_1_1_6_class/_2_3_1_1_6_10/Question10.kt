package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_10

/**
 * Write a Kotlin program that creates a class 'Product' with properties for name, price, and quantity. Calculate the total cost of the product with a function.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    print("Enter Price: ")
    val price = readln().toDouble()
    print("Enter Quantity: ")
    val quantity = readln().toLong()
    val product = Product(
        name,
        price,
        quantity
    )
    print("Total Cost of (${product.name}) Product: ${product.totalCostOfProduct()}£")
}