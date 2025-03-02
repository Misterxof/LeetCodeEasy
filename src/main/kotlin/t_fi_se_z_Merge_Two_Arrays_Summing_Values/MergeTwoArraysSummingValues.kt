package t_fi_se_z_Merge_Two_Arrays_Summing_Values

class MergeTwoArraysSummingValues {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val map = HashMap<Int, Int>()

        nums1.forEach { map[it[0]] = it[1] }

        nums2.forEach {
            if (map.containsKey(it[0])) map[it[0]] = it[1] + map[it[0]]!!
            else map[it[0]] = it[1]
        }

        val result = Array<IntArray>(map.size) {IntArray(2)}
        var i = 0

        map.toSortedMap().forEach {
            result[i][0] = it.key
            result[i][1] = it.value
            i++
        }

        return result
    }
}