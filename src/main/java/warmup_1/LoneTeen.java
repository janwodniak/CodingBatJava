package warmup_1;

import java.util.Arrays;

public class LoneTeen {

    public boolean loneTeen(int a, int b) {
        return Arrays.stream(new int[]{a, b})
                .filter(i -> i >= 13 && i <= 19)
                .count() == 1;
    }
}
