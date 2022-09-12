package functional_2;

import java.util.List;

public class Square56 {

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n * n) + 10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .toList();
    }
}
