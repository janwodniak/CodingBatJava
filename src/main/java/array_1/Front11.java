package array_1;

public class Front11 {

    public int[] front11(int[] a, int[] b) {
        return ((a.length == 0) && (b.length == 0)) ? new int[]{} : ((a.length == 0) ? new int[]{b[0]} : ((b.length == 0) ? new int[]{a[0]} : new int[]{a[0], b[0]}));
    }
}
