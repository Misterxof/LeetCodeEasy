package f_se_s_Number_Complement

class NumberComplement {
    fun findComplement(num: Int): Int {
        var str = Integer.toBinaryString(num)
        var result = ""

        str.forEachIndexed { index, c ->
            result += if (c == '1') '0'
            else '1'
        }

        return result.toInt(2)
    }
}