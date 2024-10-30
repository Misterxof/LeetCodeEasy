package f_fi_fi_Assign_Cookies

class AssignCookies {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var count = 0
        g.sort()
        s.sort()

        s.forEach { cookie ->
            for (i in g.indices) {
                if (g[i] in 1..cookie) {
                    count++
                    g[i] = -1
                    break
                }
            }
        }

        return count
    }
}

fun main() {
    println(AssignCookies().findContentChildren(intArrayOf(1,2,3), intArrayOf(1,1)))
}