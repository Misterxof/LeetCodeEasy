package o_s_e_Excel_Sheet_Column_Title

class ExcelSheetColumnTitle {
    fun convertToTitle(columnNumber: Int): String {
        var res = ""

        if (columnNumber <= 26) res = "${(columnNumber + 64).toChar()}"
        else {
            var num = columnNumber

            loop@ while (num > 26) {
                if (num - (num / 26) * 26 == 0) {
                    num = num / 26 - 1
                    res += (90).toChar()
                    continue@loop
                }
                else {
                    res += ((num - (num / 26) * 26) + 64).toChar()
                }
                num /= 26
            }

            res += (num + 64).toChar()
        }
        return res.reversed()
    }
}

fun main() {
//    println(ExcelSheetColumnTitle().convertToTitle(27))
    println(ExcelSheetColumnTitle().convertToTitle(52))
}