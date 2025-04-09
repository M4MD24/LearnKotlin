package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_6

class Publisher : Observable {
    private val observers = mutableListOf<ObserverService>()
    private var message = ""

    override fun subscribe(observerService: ObserverService) {
        observers.add(observerService)
    }

    override fun unSubscribe(observerService: ObserverService) {
        observers.remove(observerService)
    }

    override fun setMessage(message: String) {
        this.message = message
    }

    override fun notifyObservers() = observers.forEach { it.update(message) }
}