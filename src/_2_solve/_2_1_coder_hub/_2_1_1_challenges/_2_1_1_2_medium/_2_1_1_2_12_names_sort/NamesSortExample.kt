package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_2_medium._2_1_1_2_12_names_sort

fun main() {
    println(getNamesAfterSorting(mutableListOf("Ahmed Omar", "Yousef Abdullah"), "ASC"))
    println(getNamesAfterSorting(mutableListOf("Mohammed Yahya", "Khaled Bader", "Khaled Bader"), "DESC"))
    println(getNamesAfterSorting(mutableListOf("Khaled Bader"), "ASC"))
    print(getNamesAfterSorting(mutableListOf(), "DESC"))
}

private fun getNamesAfterSorting(names: MutableList<String>, order: String): MutableList<String> {
    if (order == "ASC")
        names.sort()
    else if (order == "DESC")
        names.sortDescending()
    return names
}