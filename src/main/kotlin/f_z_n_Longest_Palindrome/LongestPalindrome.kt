package f_z_n_Longest_Palindrome

class LongestPalindrome {
    fun longestPalindrome(s: String): Int {
        var result = 0
        var  s = s
        var out = 0

        while (s.isNotBlank()) {
            val first = s.first()
            s = s.replaceFirst(first.toString(), "")
            val second = s.find{it == first}
            if (second != null) {
                result += 2
                s = s.replaceFirst(second.toString(), "")
            } else
                out++
        }
        if (out > 0) result++

        return result
    }

    // 1) grouping by letters 2) counting letters -> {letter - count}
    // 3) remove count = 1 (v/2), restore length (*2)
    // 4) minOf (sum + 1, s.length), cause sum + 1 can be more than s.length
    fun longestPalindrome2(s: String): Int {
        var result = s.groupingBy { it }.eachCount().map { (k,v)-> v/2*2 }
        return minOf(result.sum() + 1, s.length)
    }

    // fastest
    fun longestPalindrome3(s: String): Int {
        var hashMap: HashMap<Char, Int> = hashMapOf()
        var result = 0
        var out = 0

        s.forEachIndexed { i, it ->
            if (hashMap.containsKey(it))
                hashMap[it] = hashMap[it]!! + 1
            else
                hashMap[it] = 1
        }

        hashMap.forEach {
            if (it.value > 1 && it.value % 2 == 0){
                result += it.value
            } else if (it.value > 1) {
                result += it.value / 2 * 2
                out++
            } else {
                out++
            }

        }

        if (out > 0) result += 1

        return result
    }
}

fun main()  {
    println(LongestPalindrome().longestPalindrome3("abccccdd"))
    println(LongestPalindrome().longestPalindrome3("a"))
    println(LongestPalindrome().longestPalindrome3("ccc"))
}