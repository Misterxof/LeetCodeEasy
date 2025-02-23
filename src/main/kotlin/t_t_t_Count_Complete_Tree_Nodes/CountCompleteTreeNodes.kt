package t_t_t_Count_Complete_Tree_Nodes

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal.TreeNode

class CountCompleteTreeNodes {
    fun countNodes(root: TreeNode?): Int {
        return if (root == null) 0 else countNodes(root, 0)
    }

    fun countNodes(root: TreeNode, count: Int): Int {
        var count = count

        if (root.left != null) count += countNodes(root.left!!, 0)
        if (root.right != null) count += countNodes(root.right!!, 0)
        count++

        return count
    }
}