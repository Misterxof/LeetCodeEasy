package o_f_fi_Binary_Tree_Postorder_Traversal

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal

class BinaryTreePostorderTraversal {
    val result = mutableListOf<Int>()

    // bottom -> top, left -> right
    fun postorderTraversal(root: BinaryTreePreorderTraversal.TreeNode?): List<Int> {
        root?.let {
            root.left?.let { postorderTraversal(root.left) }
            root.right?.let { postorderTraversal(root.right) }
            result.add(root.`val`)
        }
        return result
    }
}