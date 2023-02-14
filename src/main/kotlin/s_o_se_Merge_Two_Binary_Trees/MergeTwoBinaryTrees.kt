package s_o_se_Merge_Two_Binary_Trees

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal.TreeNode

class MergeTwoBinaryTrees {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        var res: TreeNode? = null
        if (root1 != null) {
            res = root1
            merge(res, root2)
        }
        else {
            res = root2
            merge(res, root1)
        }
        return res
    }

    private fun merge(root1: TreeNode?, root2: TreeNode?) {
        var root1 = root1
        if (root1 != null && root2!= null){
            val a = root1.`val`
            val b = root2.`val`
            root1?.`val` = a + b
        }

        if(root2?.left != null) {
            if (root1!!.left == null){
                root1.left = TreeNode(0)
                merge(root1?.left , root2?.left)
            } else merge(root1?.left , root2?.left)
        }
        if(root2?.right != null) {
            if (root1!!.right == null){
                root1.right = TreeNode(0)
                merge(root1?.right , root2?.right)
            } else merge(root1?.right , root2?.right)
        }
    }
}