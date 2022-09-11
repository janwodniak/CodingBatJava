package warmup_1;

public class Close10 {

    public int close10(int a, int b) {
        int diffAbsA = Math.abs(a - 10);
        int diffAbsB = Math.abs(b - 10);

        if (diffAbsA < diffAbsB) {
            return a;
        } else if (diffAbsA > diffAbsB) {
            return b;
        } else {
            return 0;
        }
    }
}
