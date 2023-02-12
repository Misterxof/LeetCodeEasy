package e_f_f_Backspace_String_Compare

class BackspaceStringCompare {
    fun backspaceCompare(s: String, t: String): Boolean {
        return backspace(s) == backspace(t)
    }

    private fun backspace(s: String): String {
        val c = CharArray(s.length)
        var s = s.toCharArray()
        var i = 0
//println()
        while (i <= s.size - 1) {
            if (s[i] == '#' && i - 1 >= 0){
              //  s = s.replace("${s[i - 1]}${s[i]}", "")
                s[i-1] = ' '
                s[i] = ' '
                i -= 2
            } else if (s[i] == '#') {
                s[i] = ' '
             //   s = s.replaceFirst(s[i].toString(), "")
              //  i -= 1
            }
            i++
//            println("i=$i s=$s")
        }
        println(s.joinToString("").replace("\\s+".toRegex(), " "))
        println()
        return s.toString()
    }
}

fun main() {
    println(BackspaceStringCompare().backspaceCompare(s = "ab#c", t = "ad#c"))
    println(BackspaceStringCompare().backspaceCompare(s = "oi###mupo##rszty#s#xu###bxx##dqc#gdjz", t = "oi###mu#ueo##pk#o##rsztu#y#s#xu###bxx##dqc#gz#djz"))
}