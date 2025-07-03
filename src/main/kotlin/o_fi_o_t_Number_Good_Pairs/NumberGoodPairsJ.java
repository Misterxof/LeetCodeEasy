package o_fi_o_t_Number_Good_Pairs;

import java.util.HashMap;
import java.util.Map;

public class NumberGoodPairsJ {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            pairs.put(nums[i], pairs.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e: pairs.entrySet()) {
            if (e.getValue() > 1) result += (e.getValue() * (e.getValue() - 1)) / 2;
        }

        return result;
    }
}
