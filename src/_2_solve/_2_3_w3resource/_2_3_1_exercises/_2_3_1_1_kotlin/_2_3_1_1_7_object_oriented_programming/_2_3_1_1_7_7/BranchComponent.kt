package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_7

class BranchComponent(private var name: String) : Component {
    fun getName() = name
    fun setName(name: String) {
        this.name = name
    }

    override fun showDetails() = println(" ".repeat(Component.COUNT_OF_SPACES) + "File: " + name)
}