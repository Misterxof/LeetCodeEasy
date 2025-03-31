package o_s_e_f_Count_Number_Consistent_Strings

class CountNumberConsistentStrings {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val setAllowed = HashSet<Char>()
        var result = 0

        allowed.forEach { setAllowed.add(it) }

        words.forEach {
            var isAllowed = true
            for (i in it.indices) {
                if (!setAllowed.contains(it[i])) {
                    isAllowed = false
                    break;
                }
            }
            if (isAllowed) result++
        }

        return result
    }
}