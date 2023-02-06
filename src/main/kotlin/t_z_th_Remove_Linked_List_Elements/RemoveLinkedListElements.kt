package t_z_th_Remove_Linked_List_Elements

import t_th_f_palindrome_linked_list.ListNode
import t_th_f_palindrome_linked_list.ListNode.Node

class RemoveLinkedListElements {
    fun removeElements(head: Node?, `val`: Int): Node? {
        return ListNode(arrayOf(1)).removeElements(head, `val`)
    }

    // LeetCode solution
    //fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    //        if (head == null) return null
    //        var result: ListNode?
    //        var node = head
    //
    //        if (node?.`val` != `val`) {
    //            result = ListNode(node!!.`val`)
    //            result.next = removeElements(node?.next, `val`)
    //        } else result = removeElements(node.next, `val`)
    //
    //        return result
    //    }
}

fun main() {
    var node = ListNode(arrayOf(1,2,6,3,4,5,6)).firstNode
    RemoveLinkedListElements().removeElements(node, 6)

    node = ListNode(arrayOf(7,7,7,7)).firstNode
    RemoveLinkedListElements().removeElements(node, 7)

    node = ListNode(arrayOf(1,1,2,2,2,2)).firstNode
    RemoveLinkedListElements().removeElements(node, 1)

    node = ListNode(arrayOf(1,1,2,1,1,2)).firstNode
   println( RemoveLinkedListElements().removeElements(node, 1))
}