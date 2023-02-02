package n_fi_th_Verifying_Alien_Dictionary

class VerifyingAlienDictionary {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        var sortedWords = words.clone()
        val comparator = Comparator<String> { o1, o2 ->
            for (i  in 0 until minOf(o1.length, o2.length)) {
                val first = order.indexOf(o1[i])
                val second = order.indexOf(o2[i])

                if (first != second)
                    return@Comparator first - second
            }
            o1.length - o2.length
        }
        sortedWords.sortWith(comparator)
        return sortedWords.contentEquals(words)
    }
}

fun main(args: Array<String>) {
    println(VerifyingAlienDictionary().isAlienSorted(arrayOf("hello","leetcode"),"hlabcdefgijkmnopqrstuvwxyz"))
    println(VerifyingAlienDictionary().isAlienSorted(arrayOf("word","world","row"),"worldabcefghijkmnpqstuvxyz"))
    println(VerifyingAlienDictionary().isAlienSorted(arrayOf("apple","app"),"abcdefghijklmnopqrstuvwxyz"))
    println(VerifyingAlienDictionary().isAlienSorted(arrayOf("ubg","kwh"),"uk"))
}