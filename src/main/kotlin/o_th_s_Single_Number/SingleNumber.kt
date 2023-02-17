package o_th_s_Single_Number

class SingleNumber {
    fun singleNumber2(nums: IntArray): Int {
        val set = hashSetOf<Int>()

        nums.forEach {
            if (!set.add(it))
                set.remove(it)
        }

        return set.elementAt(0)
    }

    // faster
    fun singleNumber(nums: IntArray): Int {
        var singleNumber = 0

        nums.forEach {
            singleNumber = singleNumber.xor(it)
        }

        return singleNumber
    }
}

fun main() {
    SingleNumber().singleNumber(intArrayOf(4,1,2,1,2))
}