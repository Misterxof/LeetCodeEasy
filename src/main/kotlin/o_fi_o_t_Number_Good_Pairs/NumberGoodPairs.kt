package o_fi_o_t_Number_Good_Pairs

class NumberGoodPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        val pairs = hashMapOf<Int, Int>()
        var result = 0

        nums.forEach {
            pairs[it] = pairs.getOrDefault(it, 0) + 1
        }

        pairs.forEach { k,v ->
            if (v > 1) result += (v * (v - 1)) / 2
        }

        return result
    }
}