package warmup_1;

import java.util.Arrays;

public class HasTeen {

    public boolean hasTeen(int a, int b, int c) {
        return Arrays.stream(new int[]{a, b, c}).anyMatch(n -> n >= 13 && n <= 19);
    }
}
