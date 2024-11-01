package o_se_o_Excel_Sheet_Column_Number

class ExcelSheetColumnNumber {
    fun titleToNumber(columnTitle: String): Int {
        var res = 0
        var i = 0

        while (i < columnTitle.length) {
            res *= 26
            res += (columnTitle[i].code - 64)
            i++
        }
        return res
    }
}

fun main() {
    println(ExcelSheetColumnNumber().titleToNumber("A"))
    println(ExcelSheetColumnNumber().titleToNumber("Z"))
    println(ExcelSheetColumnNumber().titleToNumber("AA"))
    println(ExcelSheetColumnNumber().titleToNumber("AB"))
    println(ExcelSheetColumnNumber().titleToNumber("BA"))
    println(ExcelSheetColumnNumber().titleToNumber("ZA"))
    println(ExcelSheetColumnNumber().titleToNumber("ZZ"))
    println(ExcelSheetColumnNumber().titleToNumber("AAA"))
    println(ExcelSheetColumnNumber().titleToNumber("ZZZ"))
    println(ExcelSheetColumnNumber().titleToNumber("AAAA"))
    println(ExcelSheetColumnNumber().titleToNumber("AAAB"))
}