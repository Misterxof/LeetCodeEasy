package n_Palindrome_Numberv

class Solution {
    // R = 64,69% M=73,29%
    // R = 98,41% M=93,24% 2 min dif
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        var xR =0
        var xt = x
        while (xt != 0) {
            xR = xR * 10 + xt % 10;
            xt /= 10;
        }


        val str = x.toString()
        println("$x $xR")
        return x == xR
    }

    // R = 62,44% M=54,34%
    fun isPalindrome2(x: Int): Boolean {
        val str = x.toString()
        return str == str.reversed()
    }
}