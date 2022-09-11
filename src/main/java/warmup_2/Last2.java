package warmup_2;

public class Last2 {

    public int last2(String str) {
        int counter = 0;
        int length = str.length();
        if (length <= 2) {
            return counter;
        }
        String last2 = str.substring(length - 2);

        for (int i = 0; i < length - 2; i++) {
            if (str.startsWith(last2, i)) {
                counter++;
            }
        }
        return counter;
    }
}
