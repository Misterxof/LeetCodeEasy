package f_o_f_Third_Maximum_Number

class ThirdMaximumNumber {
    fun thirdMax(nums: IntArray): Int {
        val maxArray = LongArray(3) { Long.MIN_VALUE }

        for (i in nums.indices) {
            if (maxArray.contains(nums[i].toLong())) continue

            when {
                nums[i] > maxArray[0] -> {
                    maxArray[2] = maxArray[1]
                    maxArray[1] = maxArray[0]
                    maxArray[0] = nums[i].toLong()
                }

                nums[i] > maxArray[1] -> {
                    maxArray[2] = maxArray[1]
                    maxArray[1] = nums[i].toLong()
                }

                nums[i] > maxArray[2] -> {
                    println(nums[i])
                    maxArray[2] = nums[i].toLong()
                }
            }
        }

        return if (maxArray[2] == Long.MIN_VALUE) maxArray[0].toInt() else maxArray[2].toInt()
    }
}

fun main() {
    ThirdMaximumNumber().thirdMax(intArrayOf(1, 2, -2147483648))
}