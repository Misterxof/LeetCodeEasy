package fi_e_n_Nary_Tree_Preorder_Traversal

class NaryTreePreorderTraversal {
    val result = mutableListOf<Int>()
    fun preorder(root: Node?): List<Int> {
        root?.let {
            result.add(root!!.`val`)
            root.children.forEach {preorder(it)}
        }
        return result
    }
}

fun main() {
    val node = Node(1).getTreeFromRoot(listOf(1,null,2,3,4,5,null,null,6,7,null,8,null,9,10))
    println(node.toString())
    val nar = NaryTreePreorderTraversal()
    println(nar.preorder(node))
}