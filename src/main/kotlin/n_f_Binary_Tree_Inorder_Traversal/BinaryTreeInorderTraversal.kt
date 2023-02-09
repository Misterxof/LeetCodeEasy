package n_f_Binary_Tree_Inorder_Traversal

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal

class BinaryTreeInorderTraversal {
    val listL = mutableListOf<String>()
    val listR = mutableListOf<String>()

    fun isSymmetric(root: BinaryTreePreorderTraversal.TreeNode?): Boolean {
        if (root?.left == null && root?.right == null) return true
        inorderTraversal(root?.left, "")
        reverseInorderTraversal(root?.right, "")

        return listL == listR
    }

    fun inorderTraversal(root: BinaryTreePreorderTraversal.TreeNode?, s: String) {
        root?.let {
            root.left?.let { inorderTraversal(root.left, "l") }
            listL.add(s + root.`val`)
            root.right?.let { inorderTraversal(root.right, "r") }
        }
    }

    fun reverseInorderTraversal(root: BinaryTreePreorderTraversal.TreeNode?, s: String) {
        root?.let {
            root.right?.let { reverseInorderTraversal(root.right, "l") }
            listR.add(s + root.`val`)
            root.left?.let { reverseInorderTraversal(root.left, "r") }
        }
    }
}