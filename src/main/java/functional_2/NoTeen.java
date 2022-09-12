package functional_2;

import java.util.List;

public class NoTeen {

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n < 13 || n > 19)
                .toList();
    }
}
