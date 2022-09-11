package warmup_1;

public class In1020 {

    public boolean in1020(int a, int b) {
        return in1020(a) || in1020(b);
    }

    private boolean in1020(int n) {
        return n >= 10 && n <= 20;
    }
}
