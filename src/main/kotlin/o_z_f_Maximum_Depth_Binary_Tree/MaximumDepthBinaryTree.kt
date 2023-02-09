package o_z_f_Maximum_Depth_Binary_Tree

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal

class MaximumDepthBinaryTree {
    fun maxDepth(root: BinaryTreePreorderTraversal.TreeNode?): Int {
        var maxDepthLeft = 0
        var maxDepthRight = 0

        root?.let{
            maxDepthLeft = maxOf(maxDepthLeft, maxDepth(it.left) + 1)
            maxDepthRight = maxOf(maxDepthLeft, maxDepth(it.right) + 1)
        }

        return maxOf(maxDepthLeft, maxDepthRight)
    }
}