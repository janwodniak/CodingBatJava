package array_1;

import java.util.Arrays;

public class Sum3 {

    public int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }
}
