package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_4_recursion._2_3_1_1_4_12

/**
 * Write a Kotlin recursive function to check if a binary tree is a binary search tree.
 * */

private data class BinaryTreeNode(
    val value: Int,
    val left: BinaryTreeNode? = null,
    val right: BinaryTreeNode? = null
)

fun main() {
    val binaryTree = BinaryTreeNode(
        4,
        BinaryTreeNode(
            2,
            BinaryTreeNode(1),
            BinaryTreeNode(3)
        ),
        BinaryTreeNode(
            6,
            BinaryTreeNode(5),
            BinaryTreeNode(7)
        )
    )
    print(isBinarySearchTree(binaryTree))
}

private fun isBinarySearchTree(
    root: BinaryTreeNode?,
    minimum: Int = Int.MIN_VALUE,
    maximum: Int = Int.MAX_VALUE
): Boolean {
    if (root == null)
        return true
    if (
        root.value <= minimum ||
        root.value >= maximum
    )
        return false
    return isBinarySearchTree(
        root.left,
        minimum,
        root.value
    ) && isBinarySearchTree(
        root.right,
        root.value,
        maximum
    )
}