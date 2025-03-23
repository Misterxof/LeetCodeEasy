package n_t_fi_Long_Pressed_Name

class LongPressedName {
    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = 0
        var j = 0

        while (i < name.length && j < typed.length) {
            if (name[i] == typed[j]) {
                i++
                j++
            } else if (j >= 1 && typed[j] == typed[j - 1]) {
                j++
            } else return false
        }

        if (i != name.length) return false
        else {
            while (j < typed.length) {
                if (typed[j] != typed[j - 1]) return false
                j++
            }
        }

        return true
    }
}