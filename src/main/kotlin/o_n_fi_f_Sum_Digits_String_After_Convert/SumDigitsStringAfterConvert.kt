package o_n_fi_f_Sum_Digits_String_After_Convert

class SumDigitsStringAfterConvert {
    fun getLucky(s: String, k: Int): Int {
        var str = StringBuilder()

        s.forEach {
            str.append(it - 'a' + 1)
        }

        repeat(k) {
            var temp = 0L
            str.toString().forEach { temp += it.digitToInt() }
            str.clear()
            str.append(temp)
        }

        return str.toString().toInt()
    }
}