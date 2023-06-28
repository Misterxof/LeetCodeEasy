package th_t_s_Power_Three

import kotlin.math.abs

class PowerOfThree {
    fun isPowerOfThree(n: Int): Boolean {
        if (n == -1 || n == 0) return false
        
        var n = n

        while (abs(n) > 1 && n % 3 == 0)
            n /= 3

        return n == 1
    }
}