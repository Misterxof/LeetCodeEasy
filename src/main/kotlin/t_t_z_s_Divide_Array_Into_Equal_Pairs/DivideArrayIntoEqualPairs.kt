package t_t_z_s_Divide_Array_Into_Equal_Pairs

class DivideArrayIntoEqualPairs {
    fun divideArray(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        var count = 0

        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        map.forEach {
            if (it.value % 2 == 0) count += it.value / 2
            else return false
        }

        return count == nums.size / 2
    }
}