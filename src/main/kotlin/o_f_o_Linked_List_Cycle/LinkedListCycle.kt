package o_f_o_Linked_List_Cycle

class LinkedListCycle {

    fun hasCycle2(head: ListNode?): Boolean {
        var node = head
        var hashMap = hashMapOf<ListNode, Int>()

        while (node != null) {
            if (hashMap.contains(node))
                return true
            else
                hashMap.put(node!!, 0)

            node = node.next
        }

        return false
    }

    // Two pointer
    fun hasCycle(head: ListNode?): Boolean {
        var slowPointer = head
        var fastPointer = head

        while (slowPointer != null && fastPointer?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next

            if (slowPointer == fastPointer)
                return true
        }

        return false
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}