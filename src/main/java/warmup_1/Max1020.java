package warmup_1;

public class Max1020 {

    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (in1020(a)) {
            return a;
        }

        if (in1020(b)) {
            return b;
        }
        return 0;
    }

    public boolean in1020(int n) {
        return n >= 10 && n <= 20;
    }
}
