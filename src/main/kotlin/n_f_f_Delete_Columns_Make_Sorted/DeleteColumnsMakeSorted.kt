package n_f_f_Delete_Columns_Make_Sorted

class DeleteColumnsMakeSorted {
    fun minDeletionSize(strs: Array<String>): Int {
        val result = HashSet<Int>()
        val arr = CharArray(strs[0].length)

        for (i in strs.indices) {
            for (j in strs[i].indices) {
                if (i != 0) {
                    if (strs[i - 1][j] > strs[i][j]) result.add(j)
                } else {
                    arr[j] = strs[i][j]
                }
            }
        }

        return result.size
    }
}