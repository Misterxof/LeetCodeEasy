package f_o_fi_Add_Strings

class AddStrings {
    fun addStrings(num1: String, num2: String): String {
        var i = num1.length - 1
        var j = num2.length - 1
        var next = 0
        var result = ""

        while (i >= 0 || j >= 0 || next != 0) {
            if (i >= 0) next += num1[i--] - '0'
            if (j >= 0) next += num2[j--] - '0'

            result = "${next % 10}$result"
            next /= 10
        }

        return result
    }
}

fun main() {
    println(AddStrings().addStrings("456", "77"))
}