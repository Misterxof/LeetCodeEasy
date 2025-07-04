package f_s_th_Island_Perimeter;

public class IslandPerimeterJ {
    public int islandPerimeter(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (i > 0 && grid[i - 1][j] == 1) result -= 2;
                    if (j > 0 && grid[i][j - 1] == 1) result -= 2;
                }
            }
        }

        return result;
    }
}
