package _1_learn._1_3_object_oriented_programming._1_3_23_scope_functions._1_3_23_2_apply

import _1_learn._1_3_object_oriented_programming._1_3_23_scope_functions._1_3_23_4_run.Employee

fun main() {
    val employee = Employee("Mohamed Sadawy", "Native Android Developer").apply {
        this.name = "Ahmed Mahmoud"
        job = "Front-End Web"
        println("Name: $name")
    }
    print("Job: " + employee.job)
}