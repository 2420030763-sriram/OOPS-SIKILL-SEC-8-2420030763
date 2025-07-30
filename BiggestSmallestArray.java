
public class BiggestSmallestArray {

	public static void main(String[] args) {
		int[] a = {12, 5, 30, 7};
        int max = a[0], min = a[0];
        for (int n : a) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
