package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_24_valid_path

fun validPath(n: Int, edges: MutableList<Int>, source: Int, destination: Int): Boolean {
    val adjacency = Array(n) { mutableListOf<Int>() }
    for (i in 0 until edges.size step 2) {
        val u = edges[i]
        val v = edges[i + 1]
        adjacency[u].add(v)
        adjacency[v].add(u)
    }
    val visited = BooleanArray(n)
    val queue = ArrayDeque<Int>()
    queue.add(source)
    visited[source] = true
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        if (current == destination) return true
        for (neighbor in adjacency[current]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true
                queue.add(neighbor)
            }
        }
    }
    return false
}

fun main() {
    val testCases = listOf(
        Triple(3, mutableListOf(0, 1, 1, 2, 2, 0), 0 to 2),
        Triple(6, mutableListOf(0, 1, 0, 2, 3, 5, 5, 4, 4, 3), 0 to 5),
        Triple(1, mutableListOf(), 0 to 0),
        Triple(2, mutableListOf(0, 1), 0 to 1)
    )
    for (testCase in testCases) {
        println(validPath(testCase.first, testCase.second, testCase.third.first, testCase.third.second))
    }
}