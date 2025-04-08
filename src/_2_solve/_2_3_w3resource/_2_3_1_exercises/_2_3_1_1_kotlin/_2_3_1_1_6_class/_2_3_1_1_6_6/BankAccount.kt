package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_6

import kotlin.math.abs

class BankAccount(
    private var accountNumber: String,
    private var balance: Double,
    private val accountHolderName: String
) {
    fun deposit(amount: Double) {
        balance += abs(amount).also { println("Done Deposit $it") }
    }

    fun withdraw(amount: Double) {
        balance -= abs(amount).also { println("Done Withdraw $it") }
    }
}