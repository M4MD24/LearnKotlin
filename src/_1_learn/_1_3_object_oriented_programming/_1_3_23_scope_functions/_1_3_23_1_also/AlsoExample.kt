package _1_learn._1_3_object_oriented_programming._1_3_23_scope_functions._1_3_23_1_also

fun main() {
    val employee = Employee("Mohamed Sadawy", "Native Android Developer").also {
        it.name = "Ahmed Mahmoud"
        it.job = "Front-End Web"
        println("Name: " + it.name)
    }
    print("Job: " + employee.job)
}