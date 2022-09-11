package warmup_2;

public class CountXX {

    public int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i)) {
                counter++;
            }
        }
        return counter;
    }
}
