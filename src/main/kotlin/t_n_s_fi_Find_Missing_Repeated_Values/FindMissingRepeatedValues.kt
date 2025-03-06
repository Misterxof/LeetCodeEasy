package t_n_s_fi_Find_Missing_Repeated_Values

class FindMissingRepeatedValues {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val arr = IntArray(grid.size * grid[0].size)
        var mis = 0
        var rep = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (arr[grid[i][j] - 1] == 0) arr[grid[i][j] - 1] = 1
                else rep = grid[i][j]
            }
        }

        for (i in arr.indices) {
            if (arr[i] == 0) mis = i + 1
        }

        return intArrayOf(rep, mis)
    }
}