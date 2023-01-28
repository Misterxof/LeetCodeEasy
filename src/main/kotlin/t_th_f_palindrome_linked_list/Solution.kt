package t_th_f_palindrome_linked_list

class Solution {
    fun isPalindrome(head: Array<Int>): Boolean {
        return ListNode(head).check()
    }

    //  LeetCode solution
//    fun isPalindrome(head: ListNode?): Boolean {
//        val deque: ArrayDeque<Int> = ArrayDeque()
//        var node: ListNode? = head
//        val result = false
//
//        while (node != null) {
//            deque.add(node.`val`)
//            node = node.next
//        }
//
//        if (deque.size == 1) true
//
//        while (deque.size > 0) {
//            if (deque.size > 2) {
//                if (deque.removeFirst() != deque.removeLast())
//                    return false
//            } else {
//                return if (deque.size == 1) true
//                else deque.first() == deque.last()
//            }
//        }
//        return result
//    }
}