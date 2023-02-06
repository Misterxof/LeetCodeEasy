package t_th_f_palindrome_linked_list

open class ListNode(val head: Array<Int>) {
    var firstNode: Node?
    private var size = head.size

    init {
        firstNode = initNodes(0)
    }

    private fun initNodes(index: Int): Node? {
        if (head.isEmpty()) return null
        var node = if (index + 1 <= head.indices.last) {
            Node(head[index], initNodes(index + 1))
        } else {
            Node(head[index], null)
        }
        return node
    }

    private fun getListNode(list: List<Int>): Node? {
        var node: Node? = null
        list.forEach {
            val nextNode = Node(it.toInt())
            nextNode.next = node
            node = nextNode
        }
        return node
    }

    // 83. Remove Duplicates from Sorted List
    fun removeDuplicates(node: Node?): Node? {
        var node = node
        val set = mutableSetOf<Int>()

        while (node != null){
            set.add(node.data)
            node = node.next
        }

        println(set)
        return getListNode(set.toList())
    }

    // 206. Reverse Linked List
    fun reverseList(node: Node?): Node? {
        var resultNode: Node? = null
        var node = node

        while (node != null) {
            val nextNode = Node(node.data)
            nextNode.next = resultNode
            resultNode = nextNode
            node = node.next
        }
        return resultNode
    }

    // 21. Merge Two Sorted Lists
    public fun mergeTwoLists(l1: Node?, l2: Node?): Node? {
        when {
            l1 == null && l2 == null -> return null
            l1 == null -> return l2
            l2 == null -> return l1
        }

        var l1 = l1
        var l2 = l2
        var resultList: MutableList<Int> = mutableListOf()

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.data < l2.data) {
                    resultList.add(l1.data)
                    l1 = l1.next
                } else {
                    resultList.add(l2.data)
                    l2 = l2.next
                }
            } else if (l1 != null) {
                resultList.add(l1.data)
                l1 = l1.next
            } else if (l2 != null) {
                resultList.add(l2.data)
                l2 = l2.next
            }
        }

        return getListNode(resultList.reversed())
    }

    // 876. Middle of the Linked List
    fun getMiddle(): Node {
        val array: MutableList<Node> = mutableListOf()
        var node: Node? = firstNode

        while (node != null) {
            array.add(node)
            node = node.next
        }

        var middleItem = array.size / 2

        return array[middleItem]
    }

    // 234. Palindrome Linked List
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
        val last = getLast(firstNode!!)

        if (firstNode!!.data == last.data) {
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
        if (firstNode!!.next != null) {
            firstNode = firstNode!!.next!!
            size--
        }
    }

    private fun removeLast() {
        if (firstNode!!.next == null) {
            size--
            return
        } else {
            var isEnd = false
            var temp: Node = firstNode!!
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