package warmup_1;

public class Diff21 {

    public int diff21(int n) {
        int diff = Math.abs(n - 21);
        if (n > 21) {
            return 2 * diff;
        }
        return diff;
    }
}
