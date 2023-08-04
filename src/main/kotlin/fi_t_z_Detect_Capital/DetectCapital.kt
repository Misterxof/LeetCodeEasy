package fi_t_z_Detect_Capital

class DetectCapital {
    fun detectCapitalUse(word: String): Boolean {
        var upper = 0

        word.forEach {
            if (it.isUpperCase()) upper++
        }

        return upper == 0 || upper == word.length || (upper == 1 && word[0].isUpperCase())
    }
}