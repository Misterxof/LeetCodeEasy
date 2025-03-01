package t_fo_s_z_Apply_Operations_Array

class ApplyOperationsArray {
    fun applyOperations2(nums: IntArray): IntArray {
        for (i in nums.indices) {
            if (i + 1 != nums.size) {
                if (nums[i] == nums[i + 1]) {
                    nums[i] *= 2
                    nums[i + 1] = 0
                }
            }
        }

        for (i in nums.indices.reversed()) {
            if (i + 1 != nums.size) {
                if (nums[i] == 0) {
                    for (j in i - 1..nums.lastIndex) {
                        nums[j + 1] = nums[j].also { nums[j] = nums[j + 1] }
                    }
                }
            }
        }

        return nums
    }

    fun applyOperations(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        var index = 0

        for (i in nums.indices) {
            if (i + 1 != nums.size) {
                if (nums[i] == nums[i + 1]) {
                    nums[i] *= 2
                    nums[i + 1] = 0
                }
            }
        }

        for (i in nums.indices) {
            if (nums[i] != 0) {
                res[index++] = nums[i]
            }
        }

        return res
    }
}