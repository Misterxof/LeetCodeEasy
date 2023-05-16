package o_s_z_Intersection_Two_Linked_Lists

import java.util.HashSet
import java.util.TreeSet

class IntersectionTwoLinkedLists {
    // HashSet
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        val hashSet = HashSet<ListNode>()
        var node = headA

        while (node != null) {
            hashSet.add(node)
            node = node.next
        }

        node = headB

        while (node != null) {
            if (!hashSet.add(node)) return node
            node = node.next
        }

        return null
    }

    // Two pointers
    fun getIntersectionNode2(headA: ListNode?, headB: ListNode?): ListNode? {
        var nodeA = headA
        var nodeB = headB

        while (nodeA != nodeB) {
            nodeA = if (nodeA == null) headA
            else nodeA.next

            nodeB = if (nodeB == null) headB
            else nodeB.next
        }

        return nodeA
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}