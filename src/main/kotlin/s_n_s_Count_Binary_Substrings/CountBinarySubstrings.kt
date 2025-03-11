package s_n_s_Count_Binary_Substrings

class CountBinarySubstrings {
    fun countBinarySubstrings(s: String): Int {
        val arr = IntArray(s.length)
        var res = 0
        var j = 0

        for (i in 1..s.lastIndex) {
            if (s[i] != s[i-1]) arr[++j] = 1
            else arr[j] += 1
        }

        for (i in 1..arr.lastIndex) {
            res += minOf(arr[i - 1], arr[i])
        }

        return res
    }
}