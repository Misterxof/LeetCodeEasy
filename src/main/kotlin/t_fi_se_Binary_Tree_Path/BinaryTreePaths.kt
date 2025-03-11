package t_fi_se_Binary_Tree_Path

class BinaryTreePaths {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val set = HashSet<String>()
        root?.let { getPats(root, StringBuilder(), set) }
        return set.toList()
    }

    fun getPats(root: TreeNode, s: StringBuilder, set: HashSet<String>) {
        s.append(root.`val`)
        if (root.left == null && root.right == null) {
            set.add(s.toString())
            return
        }
        if (root.left != null) {
            val sb = StringBuilder(s)
            sb.append("->")
            getPats(root.left!!, sb, set)
        }
        if (root.right != null) {
            val sb = StringBuilder(s)
            sb.append("->")
            getPats(root.right!!, sb, set)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}