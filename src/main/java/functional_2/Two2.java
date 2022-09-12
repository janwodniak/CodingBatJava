package functional_2;

import java.util.List;

public class Two2 {

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .toList();
    }
}
