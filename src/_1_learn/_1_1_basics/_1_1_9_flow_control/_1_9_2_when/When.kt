package _1_learn._1_1_basics._1_1_9_flow_control._1_9_2_when

fun main() {
    val number = 1
    val day1 = when (number) {
        1 -> "Saturday"
        2 -> "Sunday"
        3 -> "Monday"
        4 -> "Tuesday"
        5 -> "Wednesday"
        6 -> "Thursday"
        7 -> "Friday"
        else -> "Error"
    }
    print(day1)
}