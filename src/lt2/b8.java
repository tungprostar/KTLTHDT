package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		while (i-- > 0) {
			int total = in.nextInt();
			in.nextLine();
			String test = in.nextLine();
			int[] b = convertArr(test.split(" "));
			int[] c = new int[b.length - 1];
			int tong = 0;

			Arrays.sort(b);
			for (int x = 0; x < c.length; x++) {
				c[x] = b[x + 1] - b[x];
			}
			Arrays.sort(c);

			for (int x = 0; x < total - 2; x++) {
				if (c[x] == c[0])
					tong++;
				else if (c[x] > c[0])
					break;
			}

			System.out.println(c[0] + " " + tong);
		}
	}

	public static int[] convertArr(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

}
