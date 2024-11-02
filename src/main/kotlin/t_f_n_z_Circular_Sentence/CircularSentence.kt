package t_f_n_z_Circular_Sentence

class CircularSentence {
    fun isCircularSentence(sentence: String): Boolean {
        for (i in sentence.indices) {
            if (i == sentence.length - 1 && sentence[0] != sentence[sentence.length - 1]) return false
            if (sentence[i] == ' ' && sentence[i - 1] != sentence[i + 1]) return false
        }

        return true
    }
}

fun main() {
    println(CircularSentence().isCircularSentence("leetcode exercises sound delightful"))
    println(CircularSentence().isCircularSentence("leetcode exercises sound delightfu"))
    println(CircularSentence().isCircularSentence("leetcodel"))
}