package f_s_th_Island_Perimeter

class IslandPerimeter {
    fun islandPerimeter2(grid: Array<IntArray>): Int {
        var result = 0

        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) {
                        if (i == 0) result++
                        if (i == grid.lastIndex) result++
                        if (j == 0) result++
                        if (j == grid[0].lastIndex) result++
                        if (i - 1 >= 0 && grid[i - 1][j] == 0) result++
                        if (i + 1 <= grid.lastIndex && grid[i + 1][j] == 0) result++
                        if (j - 1 >= 0 && grid[i][j - 1] == 0) result++
                        if (j + 1 <= grid[0].lastIndex && grid[i][j + 1] == 0) result++
                }
            }
        }

        return result
    }

    fun islandPerimeter(grid: Array<IntArray>): Int {
        var result = 0

        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) {
                    result += 4
                    if (i > 0 && grid[i - 1][j] == 1) result -= 2
                    if (j > 0 && grid[i][j - 1] == 1) result -= 2
                }
            }
        }

        return result
    }
}