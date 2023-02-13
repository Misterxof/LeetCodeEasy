package o_fi_tt_th_Count_Odd_Numbers_Interval_Range

class CountOddNumbersIntervalRange {
    fun countOdds2(low: Int, high: Int): Int {
        var result = 0
        for (i in low..high) {
            if (i %2 != 0) result++
        }
        return result
    }

    // faster
    fun countOdds(low: Int, high: Int): Int {
        var result = (high - low) / 2
        if (low %2 == 1 || high %2 == 1) result++
        return result
    }
}