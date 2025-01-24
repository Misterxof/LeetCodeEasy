package o_o_o_Minimum_Depth_Binary_Tree

class MinimumDepthBinaryTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun minDepth(root: TreeNode?): Int {
        return if (root == null) 0 else minDepth(root, 1)
    }

    fun minDepth(root: TreeNode, depth: Int): Int {
        when {
            root.left == null && root.right == null -> return depth + 1
            root.left == null && root.right != null -> return minDepth(root.right!!, depth + 1)
            root.left != null && root.right == null -> return minDepth(root.left!!, depth + 1)
            else -> return minOf(minDepth(root.right!!, depth + 1), minDepth(root.left!!, depth + 1))
        }
    }
}