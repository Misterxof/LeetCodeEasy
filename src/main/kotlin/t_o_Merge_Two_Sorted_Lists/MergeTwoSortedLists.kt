package t_o_Merge_Two_Sorted_Lists

import t_th_f_palindrome_linked_list.ListNode
import t_th_f_palindrome_linked_list.ListNode.Node

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: Array<Int>, list2: Array<Int>): Node? {
        val list1 = ListNode(list1)
        val list2 = ListNode(list2)
        val result = list1.mergeTwoLists(list1.firstNode, list2.firstNode)
        return result
    }

    // Leet Code Solution
    //fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    //        when {
    //            list1 == null && list2 == null -> return null
    //            list1 == null -> return list2
    //            list2 == null -> return list1
    //        }
    //
    //        var l1 = list1
    //        var l2 = list2
    //        var resultList: MutableList<Int> = mutableListOf()
    //
    //        while (l1 != null || l2 !=null) {
    //            if (l1 != null && l2 != null)  {
    //                if (l1.`val` < l2.`val`) {
    //                    resultList.add(l1.`val`)
    //                    l1 = l1.next
    //                } else {
    //                    resultList.add(l2.`val`)
    //                    l2 = l2.next
    //                }
    //            } else if (l1 != null) {
    //                resultList.add(l1.`val`)
    //                l1 = l1.next
    //            } else if (l2 != null) {
    //                resultList.add(l2.`val`)
    //                l2 = l2.next
    //            }
    //        }
    //
    //        return getListNode(resultList.reversed())
    //    }
    //
    //    private fun getListNode(list: List<Int>): ListNode? {
    //           var node: ListNode? = null
    //           list.forEach{
    //               val nextNode = ListNode(it.toInt())
    //               nextNode.next = node
    //               node = nextNode
    //           }
    //           return node
    //       }
}

fun main(args: Array<String>) {
    println("Result:\n1,1,2,3,4,4")
    println(MergeTwoSortedLists().mergeTwoLists(arrayOf(1,2,4), arrayOf(1,3,4)))
    println("Result:\nnull")
    println(MergeTwoSortedLists().mergeTwoLists(arrayOf(), arrayOf()))
    println("Result:\n0")
    println(MergeTwoSortedLists().mergeTwoLists(arrayOf(), arrayOf(0)))
}