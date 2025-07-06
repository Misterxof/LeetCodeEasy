package o_th_n_f_Find_Lucky_Integer_Array

import java.util.TreeMap

class FindLuckyIntegerArray {
    fun findLucky2(arr: IntArray): Int {
        val tree = TreeMap<Int, Int>()
        var result = -1

        arr.forEach {
            tree[it] = tree.getOrDefault(it, 0) + 1
        }

        tree.forEach {
            if (it.key == it.value) result = it.key
        }

        return result
    }

    fun findLucky(arr: IntArray): Int {
        val freq = IntArray(501)

        arr.forEach {
            freq[it]++
        }

        for (i in arr.size downTo 0)
            if (freq[i] == i) return i

        return -1
    }
}