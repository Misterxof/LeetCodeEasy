package th_s_se_Valid_Perfect_Square

class ValidPerfectSquare {
    fun isPerfectSquare2(num: Int): Boolean {
        var l = 1L
        var r = num.toLong()

        while(l <= r) {
            val mid = l + (r - l) / 2

            if (mid * mid == num.toLong()) return true
            else {
                if (mid * mid > num) r = mid - 1
                else l = mid + 1
            }
        }

        return false
    }

    fun isPerfectSquare(num: Int): Boolean {
        var x = num.toLong()

        while(x * x > num.toLong()) {
            x = (x + num.toLong() / x) / 2
        }

        return x * x == num.toLong()
    }
}