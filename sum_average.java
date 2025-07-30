
public class sum_average {

	public static void main(String[] args) {
		 int[] a = {2, 4, 6, 8};
	        int sum = 0;
	        for (int n : a) sum += n;
	        System.out.println("Sum: " + sum);
	        System.out.println("Avg: " + (sum / (float) a.length));
	    }
	}

