package array_1;

public class FrontPiece {

    public int[] frontPiece(int[] nums) {
        return nums.length < 2 ? nums : new int[]{nums[0], nums[1]};
    }
}
