package functional_2;

import java.util.List;

public class NoNeg {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .toList();
    }

}
