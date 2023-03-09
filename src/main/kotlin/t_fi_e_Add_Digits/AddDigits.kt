package t_fi_e_Add_Digits

class AddDigits {
    fun addDigits(num: Int): Int {
        var num = num

        while (num / 10 >= 1) {
            var temp = 0
            num.toString().map{temp += Character.getNumericValue(it)}
            num = temp
        }

        return num
    }
}

fun main() {
    println(AddDigits().addDigits(38))
}