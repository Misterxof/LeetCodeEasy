package t_o_e_fi_Counting_Words_Given_Prefix

class CountingWordsGivenPrefix {
    fun prefixCount(words: Array<String>, pref: String): Int {
        var result = 0

        for (i in words.indices) {
            if (pref.length < words[i].length && words[i].startsWith(pref)) result++
        }

        return result
    }
}