package f_z_f_Sum_Left_Leaves

class SumLeftLeaves {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        return if (root != null) getSumOfLeftLeaves(root, false) else 0
    }

    fun getSumOfLeftLeaves(root: TreeNode, isLeft: Boolean): Int {
        var result = 0
        if (root.left == null && root.right == null && isLeft) return root.`val`
        if (root.left != null) result += getSumOfLeftLeaves(root.left!!, true)
        if (root.right != null) result += getSumOfLeftLeaves(root.right!!, false)
        return result
    }
}

class TreeNode(var `val`: Int) {
         var left: TreeNode? = null
         var right: TreeNode? = null
     }