package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_5

class Book(
    private val name: String,
    private val author: String,
    private val publicationYear: Short
) {
    fun printDetails() = print(
        """
        Name: $name
        Author: $author
        Publication Year: $publicationYear""".trimIndent()
    )
}