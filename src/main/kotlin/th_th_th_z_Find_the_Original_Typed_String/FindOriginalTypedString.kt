package th_th_th_z_Find_the_Original_Typed_String

class FindOriginalTypedString {
    fun possibleStringCount(word: String): Int {
        var counter = 1
        var prev = Char(0)

        word.forEach {
            if (it == prev) counter++
            else prev = it
        }

        return counter
    }
}