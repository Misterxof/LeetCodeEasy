package f_fi_fi_Assign_Cookies

class AssignCookies {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var i = 0
        var j = 0

        g.sort()
        s.sort()

        while (i <= g.size - 1 && j <= s.size - 1) {
            if (g[i] <= s[j]) i++
            j++
        }

        return i
    }
}

fun main() {
    println(AssignCookies().findContentChildren(intArrayOf(1,2,3), intArrayOf(1,1)))
}