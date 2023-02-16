package t_th_o_Power_Two

class PowerTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 0) return false
        if (n == 1) return true
        if (n %2 != 0) return false
        return isPowerOfTwo(n / 2)
    }

    fun isPowerOfTwo2(n: Int): Boolean {
        return n > 0 && Integer.bitCount(n) == 1
    }
}

fun main() {
    println(PowerTwo().isPowerOfTwo(1))
    println(PowerTwo().isPowerOfTwo(16))
    println(PowerTwo().isPowerOfTwo(0))
}