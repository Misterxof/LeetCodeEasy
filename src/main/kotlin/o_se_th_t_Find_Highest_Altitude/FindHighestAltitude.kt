package o_se_th_t_Find_Highest_Altitude

import kotlin.math.max

class FindHighestAltitude {
    fun largestAltitude(gain: IntArray): Int {
        var cur = 0
        var alt = 0

        gain.forEach {
            cur += it
            alt = max(alt, cur)
        }

        return alt
    }
}