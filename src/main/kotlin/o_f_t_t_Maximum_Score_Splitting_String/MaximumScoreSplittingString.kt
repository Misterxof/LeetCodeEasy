package o_f_t_t_Maximum_Score_Splitting_String

class MaximumScoreSplittingString {
    fun maxScore(s: String): Int {
        var ones = 0
        var zeros = 0
        var max = -1

        s.forEach { if (it == '1') ones++ }
        if (ones == s.length) return ones - 1

        s.forEachIndexed { index, c ->
            if (c == '0' && index != s.lastIndex) {
                zeros++
            } else {
                ones--
            }
            max = maxOf(max, ones + zeros)
        }

        return if (zeros == s.length) max - 1 else max
    }
}

fun main() {
    println(MaximumScoreSplittingString().maxScore("000"))
    println(MaximumScoreSplittingString().maxScore("111"))
    println(MaximumScoreSplittingString().maxScore("011"))
    println(MaximumScoreSplittingString().maxScore("001"))
    println(MaximumScoreSplittingString().maxScore("10"))
    println(MaximumScoreSplittingString().maxScore("100"))
}