package t_z_t_Happy_Number

class HappyNumber {
    fun isHappy(n: Int): Boolean {
        var number = n
        val set = mutableSetOf<Int>()

        while (number != 1) {
            if (number / 10 < 1) number *= number
            else {
                var temp = 0

                number.toString().map {
                    val t = Character.getNumericValue(it)
                    temp += t * t
                }

                number = temp
            }
            if (!set.add(number)) return false
        }

        return number == 1
    }
}

fun main() {
    println(HappyNumber().isHappy(19))
    println()
    println(HappyNumber().isHappy(2))
}