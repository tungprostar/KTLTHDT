package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t;
		i = in.nextInt();
		while (i-- > 0) {
			int n = in.nextInt();
			long k = in.nextLong();
			System.out.println(tinh(n, k));
		}
	}

	public static long tinh(int n, long k) {
		long x = (long) Math.pow(2, n - 1);
		if (k == x)
			return n;
		if (k < x)
			return tinh(n - 1, k);
		return tinh(n - 1, k - x);
	}

}
