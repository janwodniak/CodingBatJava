package warmup_2;

public class StringSplosion {

    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() + 1; i++) {
            sb.append(str, 0, i);
        }
        return sb.toString();
    }
}
