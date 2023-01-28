package t_th_f_palindrome_linked_list

open class ListNode(val head: Array<Int>) {
    private var firstNode: Node
    private var size = head.size

    init {
        firstNode = initNodes(0)
    }

    private fun initNodes(index: Int): Node {
        var node = if (index + 1 <= head.indices.last) {
            Node(head[index], initNodes(index + 1))
        } else {
            Node(head[index], null)
        }
        return node
    }

    fun check(): Boolean {
        val deque: ArrayDeque<Int> = ArrayDeque()
        val result = false
        var node: Node? = firstNode
        while (node != null) {
            deque.add(node.data)
            node = node.next
        }

        while (deque.size > 0) {
            if (deque.size > 2) {
                if (deque.removeFirst() != deque.removeLast())
                    return false
            } else {
                return if (deque.size == 1) true
                else deque.first() == deque.last()
            }
        }

        return result
    }

    fun isPalindrome(): Boolean {
        var result = false

        if (size == 1)
            return true

        while (size > 0) {
            result = checkFirstAndLast()
            if (!result)
                return false
        }

        return result
    }

    private fun checkFirstAndLast(): Boolean {
        var result = false
        val last = getLast(firstNode)

        if (firstNode.data == last.data) {
            if (size == 2) {
                size = 0
                return true
            } else {
                removeFirst()
                removeLast()
                result = true
            }
        } else {
            if (size == 2) {
                size = 0
                return false
            }
        }
        return result
    }

    private fun removeFirst() {
        if (firstNode.next != null) {
            firstNode = firstNode.next!!
            size--
        }
    }

    private fun removeLast() {
        if (firstNode.next == null) {
            size--
            return
        } else {
            var isEnd = false
            var temp: Node = firstNode
            var prev: Node? = null

            while (!isEnd) {
                if (temp.next != null) {
                    prev = temp
                    temp = temp.next!!
                } else {
                    prev!!.next = null
                    isEnd = true
                }
            }

            size--
        }
    }

    private fun getLast(node: Node): Node {
        return if (node.next == null) {
            node
        } else {
            getLast(node.next!!)
        }
    }

    data class Node(val data: Int, var next: Node? = null)
}