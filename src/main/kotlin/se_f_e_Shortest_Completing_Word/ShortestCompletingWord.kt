package se_f_e_Shortest_Completing_Word

import java.util.*

class ShortestCompletingWord {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val plate = getLetterArr(licensePlate.lowercase())
        val set = TreeSet<String>(Comparator.comparingInt(String::length))

        words.forEach {
            val array = getLetterArr(it.lowercase())
            var flag = true
            for (i in plate.indices) {
                if (plate[i] != 0) {
                    if (plate[i] > array[i]) {
                        flag = false
                        break
                    }
                }
            }
            if (flag) set.add(it)
        }

        return set.first()
    }

    fun getLetterArr(str: String): IntArray {
        val array = IntArray(26)

        str.forEach {
            if (it.isLetter()) array[it - 'a']++
        }

        return array
    }
}