package n_se_s_Largest_Perimeter_Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        int result = 0;
        int[] num = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < nums.length - 2; i++) {
            if (num[i] < num[i + 1] + num[i + 2])
                return num[i] + num[i + 1] + num[i + 2];
        }

        return result;
    }
}
