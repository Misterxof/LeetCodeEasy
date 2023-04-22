package o_se_s_e_Merge_Strings_Alternately

class MergeStringsAlternately {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        var i = 0

        while (true) {
            if (i <= word1.length - 1) result.append(word1[i])
            if (i <= word2.length - 1) result.append(word2[i])
            i++
            if (i > word1.length - 1 && i > word2.length - 1) break
        }

        return result.toString()
    }
}

fun main() {
    println(MergeStringsAlternately().mergeAlternately("abc", "pqr"))
    println(MergeStringsAlternately().mergeAlternately(word1 = "ab", word2 = "pqrs"))
    println(MergeStringsAlternately().mergeAlternately(word1 = "abcd", word2 = "pq"))
}