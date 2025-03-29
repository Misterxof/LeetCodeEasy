package o_n_z_th_Largest_Odd_Number_String

class LargestOddNumberString {
    fun largestOddNumber(num: String): String {
        return num.dropLastWhile { it.toInt() % 2 != 0 }
    }
}