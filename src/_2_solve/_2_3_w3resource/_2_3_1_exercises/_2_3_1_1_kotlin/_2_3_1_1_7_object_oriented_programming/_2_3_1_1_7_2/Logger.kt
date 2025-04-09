package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_2

object Logger {
    private lateinit var lastMessage: String
    fun log(message: String) {
        lastMessage = message
        println("Logging: $lastMessage")
    }

    fun getLastMessage() = lastMessage
}