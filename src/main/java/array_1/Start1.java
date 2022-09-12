package array_1;

public class Start1 {

    public int start1(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return 0;
        }
        if (a.length == 0) {
            return b[0] == 1 ? 1 : 0;
        }
        if (b.length == 0) {
            return a[0] == 1 ? 1 : 0;
        }
        return (a[0] == 1 ? 1 : 0) + (b[0] == 1 ? 1 : 0);
    }
}
