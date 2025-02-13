package _2_solve._2_1_coder_hub._2_1_2_competitions._2_1_2_4_leap_25_day_4_general_trip._2_1_2_4_1_easy._2_1_2_4_1_1_num_unique_bst

fun main() = print(numUniqueBST(readln().toInt()))

private fun numUniqueBST(nodeCount: Int): Int {
    if (nodeCount <= 1) return 1

    val uniqueTrees = IntArray(nodeCount + 1)
    uniqueTrees[0] = 1
    uniqueTrees[1] = 1

    for (totalNodes in 2..nodeCount) {
        for (rootNode in 1..totalNodes) {
            val leftSubtrees = uniqueTrees[rootNode - 1]
            val rightSubtrees = uniqueTrees[totalNodes - rootNode]
            uniqueTrees[totalNodes] += leftSubtrees * rightSubtrees
        }
    }

    return uniqueTrees[nodeCount]
}