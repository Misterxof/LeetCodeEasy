package s_s_Plus_One

import java.math.BigDecimal
import java.nio.charset.Charset
import javax.xml.stream.events.Characters

class PlusOne {
    fun plusOne2(digits: IntArray): IntArray {
        return digits.joinToString("").toBigDecimal().plus(BigDecimal(1)).toString().map { Character.getNumericValue(it) }.toIntArray()
    }

    // faster
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] + 1 == 10){
                digits[i] = 0
            } else {
                digits[i] = digits[i] + 1
                break
            }
        }

        return if (digits[0] == 0) {
            val newAr = IntArray(digits.size + 1)
            newAr[0] = 1
            for (i in 1 until newAr.size)
                newAr[i] = digits[i - 1]
            newAr
        } else digits
    }
}

fun main() {
    println(PlusOne().plusOne(intArrayOf(4,3,2,1)))
}