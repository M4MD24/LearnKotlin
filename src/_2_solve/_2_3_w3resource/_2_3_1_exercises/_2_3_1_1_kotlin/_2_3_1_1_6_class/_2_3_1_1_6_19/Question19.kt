package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_19

/**
 * Write a Kotlin program that creates an inline class 'Email' that represents an email address. Use the inline class to enforce type safety.
 * */

fun main() {
    print("Enter Email: ")
    val emailAddress = readln()
    val email = Email(emailAddress)
    sendEmailMessage(email)
}

private fun sendEmailMessage(email: Email) = print("Email sent to ${email.emailAddress}")