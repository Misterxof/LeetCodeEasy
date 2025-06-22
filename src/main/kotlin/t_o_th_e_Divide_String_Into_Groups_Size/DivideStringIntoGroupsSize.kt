package t_o_th_e_Divide_String_Into_Groups_Size

class DivideStringIntoGroupsSize {
    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        val result = mutableListOf<String>()
        val temp = StringBuilder()
        var counter = k

        s.forEach {
            temp.append(it)
            counter--
            if (counter == 0) {
                result.add(temp.toString())
                temp.clear()
                counter = k
            }
        }

        if (counter != k && counter != 0) {
            while (counter != 0) {
                temp.append(fill)
                counter--
            }
            result.add(temp.toString())
        }

        return result.toTypedArray()
    }
}