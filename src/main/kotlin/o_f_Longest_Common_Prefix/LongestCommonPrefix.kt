package o_f_Longest_Common_Prefix

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {

        var prefix = ""
        var prefixLetter = ' '
        var pointer = 0

        loop@ while (pointer <= strs[0].lastIndex) {
            if (strs[0] == "") break

            prefixLetter = strs[0][pointer]

            for (i in strs.indices) {
                if (pointer > strs[i].lastIndex || strs[i][pointer] != prefixLetter) break@loop
            }

            prefix += prefixLetter
            pointer++
        }

        return prefix
    }
}

fun main() {
    println(LongestCommonPrefix().longestCommonPrefix(arrayOf("flower","flow","flight")))
    println(LongestCommonPrefix().longestCommonPrefix(arrayOf("dog","racecar","car")))
    println(LongestCommonPrefix().longestCommonPrefix(arrayOf("ab","a")))
}