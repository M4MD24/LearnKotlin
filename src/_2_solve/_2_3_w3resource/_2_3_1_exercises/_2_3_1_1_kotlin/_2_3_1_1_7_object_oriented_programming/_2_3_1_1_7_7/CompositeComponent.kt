package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_7

class CompositeComponent(private var name: String) : Component {
    private val components: MutableList<Component> = ArrayList()

    fun getName() = name
    fun setName(name: String) {
        this.name = name
    }

    fun addComponent(vararg components: Component) {
        this.components.addAll(components)
    }

    override fun showDetails() {
        println("Folder: $name")
        for (component in components) {
            print(" ".repeat(Component.COUNT_OF_SPACES))
            component.showDetails()
        }
    }
}