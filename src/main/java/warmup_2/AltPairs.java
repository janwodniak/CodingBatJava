package warmup_2;

public class AltPairs {

    public String altPairs(String str) {
        int index = 0;
        int length = str.length();
        StringBuilder sb = new StringBuilder();

        while (index < length) {
            sb.append(str.charAt(index));
            if (index % 2 == 0) {
                index++;
            } else {
                index += 3;
            }
        }

        return sb.toString();
    }
}
