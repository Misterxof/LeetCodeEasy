package t_t_e_Summary_Ranges

class SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        var startV = -1
        val result = mutableListOf<String>()

        for (i in nums.indices) {
            if (i == 0) {
                startV = nums[i]
                if (nums.size == 1) {
                    result.add("${nums[i]}")
                    return result
                }
            } else {
                if (nums[i - 1] == nums[i] - 1)
                else if (nums[i - 1] == startV) {
                    result.add("$startV")
                    startV = nums[i]
                } else {
                    result.add("$startV->${nums[i - 1]}")
                    startV = nums[i]
                }

                if (i == nums.lastIndex) {
                    if (startV != nums[i]) result.add("$startV->${nums[i]}")
                    else result.add("${nums[i]}")
                }
            }
        }

        return result
    }
}

fun main() {
    println(SummaryRanges().summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))
    println(SummaryRanges().summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)))
}