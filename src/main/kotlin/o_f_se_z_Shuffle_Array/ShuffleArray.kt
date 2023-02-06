package o_f_se_z_Shuffle_Array

class ShuffleArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var result = IntArray(nums.size)
        var counter = 0

        for (i in nums.indices) {
            if (i % 2 != 0) {
                if (counter + n < nums.size - 1) {
                    result[i] = nums[n + counter]
                    counter++
                }
                if (i == nums.size - 1) result[i] = nums[i]
            } else
                result[i] = nums[i - counter]
        }

        return nums
    }
}

fun main() {
    println(ShuffleArray().shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3))
    println(ShuffleArray().shuffle(intArrayOf(1,2,3,4,4,3,2,1), 4))
    println(ShuffleArray().shuffle(intArrayOf(7,5,9,7,5,8,10,4,3,3,2,5,9,10), 7))
}