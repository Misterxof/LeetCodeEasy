package f_e_t_License_Key_Formatting

import java.util.*

class LicenseKeyFormatting {
    fun licenseKeyFormatting(s: String, k: Int): String {
        val r = s.uppercase(Locale.getDefault()).replace("-", "")
        val result = StringBuilder()
        var c = k
        var size = r.length % k

        for (i in r.indices) {
            if (size != 0) {
                result.append(r[i])
                size--
                if (size  == 0 && i != r.lastIndex) result.append('-')
            } else {
                result.append(r[i])
                c--
                if (c == 0 && i != r.lastIndex) {
                    result.append('-')
                    c = k
                }
            }
        }

        return result.toString()
    }
}