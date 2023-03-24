package se_z_n_To_Lower_Case

class ToLowerCase {
    fun toLowerCase(s: String): String {
        val lowerCase = CharArray(s.length)

        for (i in s.indices) {
            if (s[i] in 'A'..'Z') lowerCase[i] = s[i] + 32
            else lowerCase[i] = s[i]
        }

        return String(lowerCase)
    }
}