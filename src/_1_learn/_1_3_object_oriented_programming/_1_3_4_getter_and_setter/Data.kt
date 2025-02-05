package _1_learn._1_3_object_oriented_programming._1_3_4_getter_and_setter

class Data {
    private var name: String = ""

    fun getName() = name

    fun setName(name: String) {
        this.name = name
    }
}