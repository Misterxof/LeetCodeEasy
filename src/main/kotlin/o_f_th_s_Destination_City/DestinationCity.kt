package o_f_th_s_Destination_City

class DestinationCity {
    fun destCity(paths: List<List<String>>): String {
        val set = HashSet<String>()

        paths.forEach {
            set.add(it[0])
        }

        paths.forEach {
            if (!set.contains(it[1])) return it[1]
        }

        return ""
    }
}