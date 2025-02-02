package f_th_f_Number_Segments_String

class NumberSegmentsString {
    fun countSegments(s: String): Int {
        var count = 0
        var seg = 0

        for (i in s.indices) {
            if (s[i] != ' ') seg++
            else {
                if (seg != 0) {
                    count++
                    seg = 0
                }
            }
        }

        if (seg != 0) count++

        return count
    }
}