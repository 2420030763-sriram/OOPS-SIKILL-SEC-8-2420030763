
public class AdditionofTwoMatrices {

	public static void main(String[] args) {
		int[][] a = {{1, 2}, {3, 4}}, b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                c[i][j] = a[i][j] + b[i][j];
        for (int[] row : c) {
            for (int n : row) System.out.print(n + " ");
            System.out.println();
        }
	}
}
