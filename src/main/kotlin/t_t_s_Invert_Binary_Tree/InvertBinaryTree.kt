package t_t_s_Invert_Binary_Tree

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal.TreeNode

class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        val root = root
        invert(root)
        return root
    }

    fun invert(root: TreeNode?) {
        if(root == null) return

        when {
            root.left != null && root.right != null -> {
                val temp = root.left
                root.left = root.right
                root.right = temp
            }
            root.left == null && root.right != null -> {
                root.left = root.right
                root.right = null
            }
            root.left != null && root.right == null -> {
                root.right = root.left
                root.left = null
            }
        }

        invert(root.left)
        invert(root.right)
    }
}