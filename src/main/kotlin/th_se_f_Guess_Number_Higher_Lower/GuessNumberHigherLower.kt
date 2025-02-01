package th_se_f_Guess_Number_Higher_Lower

class GuessNumberHigherLower {
    fun guessNumber(n:Int):Int {
        var l = 1
        var r = n

        while (l <= r) {
            val mid = l + (r - l) / 2
            
            when(guess(mid)) {
                0 -> return mid
                -1 -> r = mid - 1
                else -> l = mid + 1
            }
        }

        return 0
    }

    fun guess(n: Int) : Int {
        return 0
    }
}