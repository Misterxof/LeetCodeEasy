package t_s_th_Ugly_Number

class UglyNumber {
    fun isUgly(n: Int): Boolean {
        var n = n

        intArrayOf(2, 3, 5).forEach {
            while (n % it == 0 && n != 0) n /= it
        }

        return n == 1
    }

}

fun main() {
    println(UglyNumber().isUgly(6))
    println(UglyNumber().isUgly(14))
    println(UglyNumber().isUgly(8))
}