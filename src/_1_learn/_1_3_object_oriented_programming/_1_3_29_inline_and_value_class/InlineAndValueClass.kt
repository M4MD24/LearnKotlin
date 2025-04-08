package _1_learn._1_3_object_oriented_programming._1_3_29_inline_and_value_class

@JvmInline
value class UserID(val id: Int)

// >
/*
inline class UserID(val id: Int)
*/

private fun printUserId(userId: UserID) = println("User ID is: ${userId.id}")

fun main() {
    val userId = UserID(123)
    printUserId(userId)
}
