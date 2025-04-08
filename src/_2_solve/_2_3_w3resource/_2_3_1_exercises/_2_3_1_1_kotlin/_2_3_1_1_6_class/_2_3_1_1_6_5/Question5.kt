package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_5

/**
 * Write a Kotlin program that creates a class 'Book' with properties for title, author, and publication year. Include a function to display book details.
 * */

fun main() {
    print("Enter Title: ")
    val title = readln()
    print("Enter Author: ")
    val author = readln()
    print("Enter Publication Year: ")
    val publicationYear = readln().toShort()
    println("# Details of Book")
    Book(
        title,
        author,
        publicationYear
    ).printDetails()
}