package t_z_s_Reverse_Linked_List

import t_th_f_palindrome_linked_list.ListNode

class ReverseLinkedList {
    fun reverseList(head: Array<Int>): ListNode.Node? {
        val list1 = ListNode(head)
        val result = list1.reverseList(list1.firstNode)
        return result
    }

    // Leet Code Solution
    //fun reverseList(head: ListNode?): ListNode? {
    //        var resultNode: ListNode? = null
    //        var node = head
    //
    //        while (node != null) {
    //            val nextNode = ListNode(node.`val`)
    //            nextNode.next = resultNode
    //            resultNode = nextNode
    //            node = node.next
    //        }
    //        return resultNode
    //    }
}

fun main(args: Array<String>) {
    println("Result:\n5,4,3,2,1")
    println(ReverseLinkedList().reverseList(arrayOf(1,2,3,4,5)))
    println("Result:\n2,1")
    println(ReverseLinkedList().reverseList(arrayOf(1,2)))
    println("Result:\nnull")
    println(ReverseLinkedList().reverseList(arrayOf()))
}