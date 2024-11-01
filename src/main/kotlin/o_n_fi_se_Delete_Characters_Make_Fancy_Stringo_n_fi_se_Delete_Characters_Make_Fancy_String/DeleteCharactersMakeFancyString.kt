package o_n_fi_se_Delete_Characters_Make_Fancy_Stringo_n_fi_se_Delete_Characters_Make_Fancy_String

class DeleteCharactersMakeFancyString {
    fun makeFancyString(s: String): String {
        val res = CharArray(s.length)

        if (s.length == 1) return s

        loop@ for (i in s.indices) {
            if (i + 2 >= s.length) {
                res[i] = s[i]
                res[i + 1] = s[i + 1]
                break
            }
            if (s[i] == s[i + 1] && s[i] == s[i + 2])continue@loop
            res[i] = s[i]
        }

        return res.joinToString(separator = "") { if(it == '\u0000') "" else it.toString()}
    }
}

fun main() {
    println(DeleteCharactersMakeFancyString().makeFancyString("leeetcooode"))
}