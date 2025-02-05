package o_se_n_z_Check_String_Swap_Strings_Equal

class CheckStringSwapStringsEqual {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        var nonEqual = 0
        var ind = -1

        for (i in s1.indices) {
            if (s1[i] != s2[i] && ind == -1) {
                ind = i
                nonEqual++
            } else if (s1[i] != s2[i] && ind != -1) {
                nonEqual++
                if (s1[i] != s2[ind] || s1[ind] != s2[i])
                    return false
            }
        }

        return true && (nonEqual == 0 || nonEqual == 2)
    }
}