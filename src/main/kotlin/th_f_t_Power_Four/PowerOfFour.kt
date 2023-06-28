package th_f_t_Power_Four

import kotlin.math.abs

class PowerOfFour {
    fun isPowerOfFour(n: Int): Boolean {
        if (n == -1 || n == 0) return false

        var n = n

        while (abs(n) > 1 && n % 4 == 0)
            n /= 4

        return n == 1
    }
}