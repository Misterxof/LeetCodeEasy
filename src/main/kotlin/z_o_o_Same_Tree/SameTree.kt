package z_o_o_Same_Tree

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal.TreeNode

class SameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return isSame(p, q, true)
    }

    private fun isSame(p: TreeNode?, q: TreeNode?, isSame: Boolean): Boolean {
        var isSame = isSame

        if (isSame) {
            if ((p == null && q != null) || (p != null && q == null)) return false
            else if (p != null && q != null) {
                if (p.`val` != q.`val`) return false
                else isSame = isSame(p.left, q.left, true) && isSame(p.right, q.right, true)
            }
        } else return false

        return isSame
    }
}