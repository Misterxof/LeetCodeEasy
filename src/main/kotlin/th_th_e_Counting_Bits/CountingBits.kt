package th_th_e_Counting_Bits

class CountingBits {
    fun countBits(n: Int): IntArray {
        val res = IntArray(n + 1)

        for (i in 0..n) {
            res[i] = res[i / 2] + (i and 1)
        }

        return res
    }
}