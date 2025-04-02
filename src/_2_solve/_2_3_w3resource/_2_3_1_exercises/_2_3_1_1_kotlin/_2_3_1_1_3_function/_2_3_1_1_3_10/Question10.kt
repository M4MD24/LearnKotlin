package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_3_function._2_3_1_1_3_10

/**
 * Write a Kotlin function that takes named arguments 'name', 'age', and 'region' and prints the details of a person.
 * */

fun main() {
    print("Enter Name: ")
    val name = readln()
    print("Enter Age: ")
    val age = readln().toShort()
    print("Enter Region: ")
    val region = readln()
    printDetailsOfPerson(name, age, region)
}

private fun printDetailsOfPerson(
    name: String,
    age: Short,
    region: String
) = print(
    """
    Details of Person
    Name: $name
    Age: $age
    Region: $region""".trimIndent()
)