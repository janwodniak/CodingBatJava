package warmup_2;

public class StringYak {

    public String stringYak(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
