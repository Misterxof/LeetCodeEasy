package n_e_n_Add_Array_Form_Integer

class AddArrayFormInteger {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        return (num.joinToString("").toBigDecimal() + k.toBigDecimal()).toString().map(Character::getNumericValue)
    }
}

fun main() {
    println(AddArrayFormInteger().addToArrayForm(intArrayOf(1,2,0,0), 34))
}