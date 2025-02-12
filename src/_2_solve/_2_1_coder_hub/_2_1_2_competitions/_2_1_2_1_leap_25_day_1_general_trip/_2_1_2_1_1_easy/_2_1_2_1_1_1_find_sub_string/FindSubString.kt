package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_1_leap_25_day_1_general_trip._2_1_2_1_1_easy._2_1_2_1_1_1_find_sub_string;

fun main() = print(findSubstring(readln(), readln()))

fun findSubstring(text: String, requiredText: String) = text.indexOf(requiredText)