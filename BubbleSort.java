
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {5, 2, 9, 1};
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
        for (int n : a) System.out.print(n + " ");	
	}
}
