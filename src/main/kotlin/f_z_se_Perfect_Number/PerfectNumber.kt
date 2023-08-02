package f_z_se_Perfect_Number

import java.util.TreeMap
import java.util.TreeSet

class PerfectNumber {
    fun checkPerfectNumber(num: Int): Boolean {
        val divisors = TreeSet<Int>()

        for (i in 1..(num / 2)) {
            if (num % i == 0) divisors.add(i)
        }

        return divisors.sum() == num
    }
}