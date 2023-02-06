package e_th_Remove_Duplicates_Sorted_List

import t_th_f_palindrome_linked_list.ListNode
import t_th_f_palindrome_linked_list.ListNode.Node

class RemoveDuplicatesSortedList {
    fun deleteDuplicates(head: Node?): Node? {
        return ListNode(arrayOf(1)).removeDuplicates(head)
    }

    // LeetCode solution
    // fun deleteDuplicates(head: ListNode?): ListNode? {
    //        var node = head
    //        val set = mutableSetOf<Int>()
    //
    //        while (node != null){
    //            set.add(node.`val`)
    //            node = node.next
    //        }
    //
    //        return getListNode(set.reversed())
    //    }
}

fun main() {
    var node = ListNode(arrayOf(1,1,2)).firstNode
    RemoveDuplicatesSortedList().deleteDuplicates(node)

    node = ListNode(arrayOf(1,1,2,3,3)).firstNode
    RemoveDuplicatesSortedList().deleteDuplicates(node)

    node = ListNode(arrayOf(0,0,0,0,3)).firstNode
    RemoveDuplicatesSortedList().deleteDuplicates(node)
}