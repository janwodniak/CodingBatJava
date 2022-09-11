package warmup_2;

public class Array123 {

    public boolean array123(int[] nums) {
        int pointer = 4;
        for (int num : nums) {
            if (num == pointer) {
                pointer++;
            }
        }
        return pointer == 4;
    }
}
