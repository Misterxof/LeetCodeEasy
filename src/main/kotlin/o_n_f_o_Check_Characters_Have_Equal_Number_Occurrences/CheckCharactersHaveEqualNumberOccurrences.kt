package o_n_f_o_Check_Characters_Have_Equal_Number_Occurrences

class CheckCharactersHaveEqualNumberOccurrences {
    fun areOccurrencesEqual(s: String): Boolean {
        val arr = IntArray(26)
        var count = 0

        s.forEach { arr[it - 'a'] += 1 }

        arr.forEach {
            if (it != 0 && count == 0) count = it
            else if (it != 0){
                if (count != it) return false
            }
        }

        return true
    }
}