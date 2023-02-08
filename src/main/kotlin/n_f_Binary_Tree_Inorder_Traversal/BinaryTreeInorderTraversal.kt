package n_f_Binary_Tree_Inorder_Traversal

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal

class BinaryTreeInorderTraversal {
    val result = mutableListOf<Int>()

    // left node right
    fun inorderTraversal(root: BinaryTreePreorderTraversal.TreeNode?): List<Int> {
        root?.let {
            root.left?.let { inorderTraversal(root.left) }
            result.add(root.`val`)
            root.right?.let { inorderTraversal(root.right) }
        }
        return result
    }
}