package o_z_o_Symmetric_Tree

import o_f_f_Binary_Tree_Preorder_Traversal.BinaryTreePreorderTraversal

class SymmetricTree {
    val listL = mutableListOf<Int>()
    val listR = mutableListOf<Int>()

    fun isSymmetric(root: BinaryTreePreorderTraversal.TreeNode?): Boolean {
        fill(root?.left, listL)
        fill(root?.right, listR)
        val s = listL.zip(listR).toHashSet()
        if (s.size%2 ==0)
        System.out.println(listL)
        System.out.println(listR)
        return listL == listR
    }

    fun fill(root: BinaryTreePreorderTraversal.TreeNode?, list: MutableList<Int>)  {
        root?.let {
            list.add(it.`val`)
            if(it.left != null) fill(it.left, list)
            if(it.right != null) fill(it.right, list)
        }
    }
}