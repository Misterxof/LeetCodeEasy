package t_f_t_Valid_Anagram

class ValidAnagram {
    fun isAnagram2(s: String, t: String): Boolean {
       return s.toCharArray().sorted() == t.toCharArray().sorted()
    }

    //  Faster
    fun isAnagram(s: String, t: String): Boolean {
        val first = IntArray(26){0}
        val second = IntArray(26){0}

        s.forEach { first[it.code - 'a'.code]++ }
        t.forEach { second[it.code - 'a'.code]++ }

        return first.contentEquals(second)
    }
}

fun main() {
    println(ValidAnagram().isAnagram("anagram", "nagaram"))
}