package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_6_class._2_3_1_1_6_6

/**
 * Write a Kotlin program that creates a class 'BankAccount' with properties for account number, balance, and account holder name. Include deposit and withdrawal functions.
 * */

fun main() {
    print("Enter Account Number: ")
    val accountNumber = readln()
    print("Enter Balance: ")
    val balance = readln().toDouble()
    print("Enter Account Holder Name: ")
    val accountHolderName = readln()
    val bankAccount = BankAccount(accountNumber, balance, accountHolderName)
    print("Enter Deposit Amount: ")
    val depositAmount = readln().toDouble()
    bankAccount.deposit(depositAmount)
    print("Enter Withdraw Amount: ")
    val withdrawAmount = readln().toDouble()
    bankAccount.withdraw(withdrawAmount)
}