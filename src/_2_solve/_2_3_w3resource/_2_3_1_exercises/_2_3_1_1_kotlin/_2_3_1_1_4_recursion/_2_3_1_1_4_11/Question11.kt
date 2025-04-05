package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_11

/**
 * Write a Kotlin recursive function to find the maximum depth of a binary tree.
 * */

private data class BinaryTreeNode(
    val value: Int,
    val left: BinaryTreeNode? = null,
    val right: BinaryTreeNode? = null
)

fun main() {
    val binaryTreeExample = BinaryTreeNode(
        1,
        BinaryTreeNode(
            2,
            BinaryTreeNode(4),
            BinaryTreeNode(5)
        ),
        BinaryTreeNode(
            3,
            BinaryTreeNode(6)
        )
    )
    print(maxDepth(binaryTreeExample))
}

private fun maxDepth(root: BinaryTreeNode?): Int = if (root == null)
    0
else 1 + maxOf(
    maxDepth(root.left),
    maxDepth(root.right)
)