package warmup_1;

public class StringE {

    public boolean stringE(String str) {
        int counter = 0;
        for (char c : str.toCharArray()) {
            if (c == 'e') counter++;
        }
        return counter >= 1 && counter <= 3;
    }
}
