package fi_n_n_Minimum_Index_Sum_Two_Lists

class MinimumIndexSumTwoLists {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val map = HashMap<String, Int>()
        val map2 = HashMap<String, Int>()
        val result = mutableListOf<String>()
        var min = Int.MAX_VALUE

        for (i in list1.indices)
            map[list1[i]] = i

        for (i in list2.indices) {
            if (map.containsKey(list2[i]))
                map2[list2[i]] = map[list2[i]]!! + i
        }

        map2.forEach { k, v ->
            min = minOf(min, v)
        }

        map2.forEach { k, v ->
            if (v == min) result.add(k)
        }

        return result.toTypedArray()
    }

    fun findRestaurant2(list1: Array<String>, list2: Array<String>): Array<String> {
        val map = HashMap<String, Int>()
        val result = mutableListOf<String>()
        var min = Int.MAX_VALUE

        for (i in list1.indices) {
            for (j in list2.indices) {
                if (list1[i] == list2[j]){
                    map[list1[i]] = i + j
                    min = minOf(min, i + j)
                }
            }
        }

        map.forEach { (k, v) ->
            if (v == min) result.add(k)
        }

        return result.toTypedArray()
    }
}