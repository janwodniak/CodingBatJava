package warmup_2;

public class NoTriples {

    public boolean noTriples(int[] nums) {
        boolean noTriples = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                noTriples = false;
                break;
            }
        }
        return noTriples;
    }
}
