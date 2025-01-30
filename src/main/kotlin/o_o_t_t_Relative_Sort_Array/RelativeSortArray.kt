package o_o_t_t_Relative_Sort_Array

import java.util.Collections

class RelativeSortArray {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val map = HashMap<Int, Int>()
        val remaining = mutableListOf<Int>()
        val result = mutableListOf<Int>()

        for (i in arr2.indices) {
            map[arr2[i]] = 0
        }

        for (i in arr1.indices) {
            if (map.containsKey(arr1[i]))
                map[arr1[i]] = map[arr1[i]]!! + 1
            else remaining.add(arr1[i])
        }

        for (i in arr2.indices) {
            repeat(map[arr2[i]]!!) {
                result.add(arr2[i])
            }
        }

        remaining.sort()

        remaining.forEach {
            result.add(it)
        }

        return result.toIntArray()
    }
}