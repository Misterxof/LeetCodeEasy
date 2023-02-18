package fi_e_Length_Last_Word

class LengthLastWord {
    fun lengthOfLastWord2(s: String): Int {
        return s.trim().split("\\s".toRegex()).last().length
    }

    // faster
    fun lengthOfLastWord(s: String): Int {
        var result = 0
        var curResult = 0

        s.forEach {
            if (it != ' ') curResult++
            else if (curResult != 0) {
                result = curResult
                curResult = 0
            }
        }

        if (curResult != 0) result = curResult

        return result
    }
}

fun main() {
    println(LengthLastWord().lengthOfLastWord("   fly me   to   the moon  "))
}