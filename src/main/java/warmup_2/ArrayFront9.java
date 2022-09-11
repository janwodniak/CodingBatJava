package warmup_2;

public class ArrayFront9 {

    public boolean arrayFront9(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < Math.min(length, 4); i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}
