package warmup_2;

public class FrontTimes {

    public String frontTimes(String str, int n) {
        String front;
        if (str.length() > 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front.repeat(n);
    }
}
