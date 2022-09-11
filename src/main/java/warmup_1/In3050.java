package warmup_1;

public class In3050 {

    public boolean in3050(int a, int b) {
        return (in3040(a) && in3040(b)) || (in4050(a) && in4050(b));
    }

    public boolean in3040(int n) {
        return n >= 30 && n <= 40;
    }

    public boolean in4050(int n) {
        return n >= 40 && n <= 50;
    }
}
