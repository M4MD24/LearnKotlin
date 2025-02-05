package _1_learn._1_3_object_oriented_programming._1_3_23_scope_functions._1_3_23_5_with

fun main() {
    val employee = Employee("Mohamed Sadawy", "Native Android Developer")
    val resultOfEmployee = with(employee) {
        this.name = "Ahmed Mahmoud"
        job = "Front-End Web"
        println("Name: $name")
        "Done"
    }
    println("Job: ${employee.job}")
    print(resultOfEmployee)
}