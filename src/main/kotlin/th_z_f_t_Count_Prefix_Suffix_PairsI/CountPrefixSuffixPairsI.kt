package th_z_f_t_Count_Prefix_Suffix_PairsI

class CountPrefixSuffixPairsI {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var result = 0

        for (i in words.indices) {
            for (j in words.indices) {
                if (i != j  && i < j && words[i].length < words[j].length) {
                    if (words[j].startsWith(words[i]) && words[j].endsWith(words[i].reversed())) result++
                }
            }
        }

        return result
    }
}