package o_n_th_fi_Maximum_Number_Words_Can_Type

class MaximumNumberWordsCanType {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        var result = 0

        text.split(" ").forEach { word ->
            var canType = true
            for (i in word.indices) {
                if (brokenLetters.contains(word[i])) {
                    canType = false
                    break
                }
            }
            if (canType) result++
        }

        return result
    }
}