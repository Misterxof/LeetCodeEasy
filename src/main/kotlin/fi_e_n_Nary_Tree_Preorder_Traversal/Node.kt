package fi_e_n_Nary_Tree_Preorder_Traversal

class Node(var `val`: Int) {
    var children: MutableList<Node?> = mutableListOf()
//    parent

    fun getTreeFromRoot(list: List<Int?>): Node {
        var list = list
        var node: Node? = null
        var isChild = false
        var countNull = 0
        var index = 0

        run exit@ {
            list.forEachIndexed { i, it ->
                if (it != null && !isChild) {
                    node = Node(it)
                    isChild = true
                } else if (it != null && isChild) {
                    println(it)
                    node!!.children.add(Node(it!!))
                } else if (it == null) {
                    countNull++
                    if (countNull == 2) {
                        isChild = false
                        index = i + 1
                        return@exit
                    }
                }
            }
        }

        list = list.slice(index until list.size)

        node!!.children.forEach {
            list = setChildNodes(it!!, list)
        }

        //more layers
//        while (list.isEmpty()) {
//
//        }

        return node!!
    }

    fun setChildNodes(child: Node, list: List<Int?>): List<Int?> {
        var countNull = 0
        var index = 0

        run exit@ {
            list.forEachIndexed { i, it ->
                if (it != null) {
                    child!!.children.add(Node(it))
                } else if (it == null) {
                    countNull++
                    if (countNull == 1) {
                        index = i + 1
                        return@exit
                    }
                }
            }
        }

        return list.slice(index until list.size)
    }

    override fun toString(): String {
        return "Node(`val`=$`val`, children=$children)"
    }


}