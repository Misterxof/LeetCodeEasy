package f_n_t_Construct_the_Rectangle

import kotlin.math.sqrt

class ConstructTheRectangle {
    fun constructRectangle(area: Int): IntArray {
        if (area <= 1) return intArrayOf(area, area)

        val divs = hashMapOf<Int, Pair<Int, Int>>()
        var min = Int.MAX_VALUE

        for (w in 1..sqrt(area.toDouble()).toInt()) {
            if (area % w == 0) {
                val l = area / w
                if (l >= w) {
                    divs[l - w] = l to w
                    min = minOf(min, l - w)
                }
            }
        }

        return intArrayOf(divs.get(min)!!.first, divs.get(min)!!.second)
    }
}