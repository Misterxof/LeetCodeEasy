package e_o_t_Largest_Triangle_Area;

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double result = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    result = Math.max(result,
                            0.5 * Math.abs(points[i][0] * points[j][1] + points[j][0] * points[k][1] + points[k][0] * points[i][1]
                                    - points[i][1] * points[j][0] - points[j][1] * points[k][0] - points[k][1] * points[i][0]));
                }
            }
        }

        return result;
    }
}
