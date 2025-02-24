package fi_z_s_Relative_Ranks

class RelativeRanks {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val map = LinkedHashMap<Int, String>()
        var i = 1

        score.forEach { map[it] = "" }

        score.sortDescending()

        score.forEach {
            when(i) {
                1 -> map[it] = "Gold Medal"
                2 -> map[it] = "Silver Medal"
                3 -> map[it] = "Bronze Medal"
                else -> map[it] = "$i"
            }
            i++
        }

        return map.values.toTypedArray()
    }
}