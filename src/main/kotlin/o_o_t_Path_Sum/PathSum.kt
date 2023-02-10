package o_o_t_Path_Sum

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal.TreeNode

class PathSum {
    val result = mutableSetOf<Boolean>()

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        root?.let{
            loop(root, targetSum, 0)
        }
        return result.contains(true)
    }

    private fun loop(root: TreeNode?, targetSum: Int, curSum: Int) {
        if(root?.left == null && root?.right == null) {
            result.add(curSum + root!!.`val` == targetSum)
        } else {
            if (root.left != null){
                loop(root.left, targetSum, curSum + root.`val`)
            }
            if (root.right != null)  {
                loop(root.right, targetSum, curSum + root.`val`)
            }
        }
    }
}