package se_e_th_Minimum_Distance_Between_BST_Nodes

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal
import kotlin.math.abs

class MinimumDistanceBetweenBSTNodes {
    fun minDiffInBST(root: BinaryTreePreorderTraversal.TreeNode?): Int {
        val set = hashSetOf<Int>()
        var min = Int.MAX_VALUE

        initSet(root, set)

        set.forEach { it ->
            set.forEach { jt ->
                if (it != jt){
                    min = minOf(min, abs(it - jt))
                }
            }
        }

        return min
    }

    private fun initSet(root: BinaryTreePreorderTraversal.TreeNode?, set: MutableSet<Int>) {
        if (root == null) return
        set.add(root.`val`)
        initSet(root.left, set)
        initSet(root.right, set)
    }
}