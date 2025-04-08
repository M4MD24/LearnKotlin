package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_15

class Person(private val name: String) {
    inner class ContactInfo(
        private val mobileNumber: String,
        private val email: String
    ) {
        fun printInformation() = print(
            """
            Name: $name
            Mobile Number: $mobileNumber
            Email: $email""".trimIndent()
        )
    }
}