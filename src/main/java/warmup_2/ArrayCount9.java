package warmup_2;

import java.util.Arrays;

public class ArrayCount9 {

    public int arrayCount9(int[] nums) {
        return (int) Arrays.stream(nums).filter(i -> i == 9).count();
    }
}
