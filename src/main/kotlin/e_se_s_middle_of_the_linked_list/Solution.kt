package e_se_s_middle_of_the_linked_list

import t_th_f_palindrome_linked_list.ListNode

class Solution {
    fun middleNode(head: Array<Int>): ListNode.Node? {
        return ListNode(head).getMiddle()
    }

    //  val array: MutableList<ListNode> = mutableListOf()
    //        var node: ListNode? = head
    //
    //        while (node != null) {
    //            array.add(node)
    //            node = node.next
    //        }
    //
    //        var middleItem = array.size / 2
    //
    //        return array[middleItem]
    //    }
}