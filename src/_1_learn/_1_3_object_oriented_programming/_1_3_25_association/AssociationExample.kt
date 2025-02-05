package _1_learn._1_3_object_oriented_programming._1_3_25_association

data class Student(val name: String)

class Course(private val courseName: String) {
    private val students: MutableList<Student> = ArrayList()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun printStudents() {
        println("Students in $courseName course:")
        for (student in students)
            println(student.name)
    }
}

fun main() {
    val student1 = Student("Mohamed")
    val student2 = Student("Ahmed")
    val student3 = Student("Mahmoud")

    val course = Course("Arabic")
    course.addStudent(student1)
    course.addStudent(student2)
    course.addStudent(student3)

    course.printStudents()
}