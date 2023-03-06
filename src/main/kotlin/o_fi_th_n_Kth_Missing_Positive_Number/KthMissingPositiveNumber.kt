package o_fi_th_n_Kth_Missing_Positive_Number

class KthMissingPositiveNumber {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var res = 0
        var curK = k

        for (i in arr.indices) {
            var t = if (i - 1 >= 0) arr[i] - arr[i - 1] - 1 else arr[i] - 1

            if (t >= curK) return if (i - 1 >= 0) arr[i - 1] + curK else curK
            else curK -= t

            if (i == arr.lastIndex && curK > 0) return arr[i] + curK
        }

        return res
    }
}

fun main() {
    println(KthMissingPositiveNumber().findKthPositive(intArrayOf(2, 3, 4, 7, 11), 5))
    println(KthMissingPositiveNumber().findKthPositive(intArrayOf(1, 2, 3, 4), 2))
}