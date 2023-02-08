package o_f_f_Binary_Tree_Preorder_Traversal

class BinaryTreePreorderTraversal {
    val result = mutableListOf<Int>()

    fun preorderTraversal(root: TreeNode?): List<Int> {
        root?.let {
            result.add(root.`val`)
            root.left?.let { preorderTraversal(root.left) }
            root.right?.let { preorderTraversal(root.right) }
        }
        return result
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}