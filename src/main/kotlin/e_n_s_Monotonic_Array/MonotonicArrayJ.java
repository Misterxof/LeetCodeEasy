package e_n_s_Monotonic_Array;

public class MonotonicArrayJ {
    public boolean isMonotonic(int[] nums) {
        var up = nums[0];
        var down = nums[0];
        var isUp = true;
        var isDown = true;

        for (int i = 0; i < nums.length; i++) {
            if (up <= nums[i]) up = nums[i];
            else isUp = false;

            if (down >= nums[i]) down = nums[i];
            else isDown = false;
        }

        return isUp || isDown;
    }
}
