package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		while (i-- > 0) {
			String total = in.nextLine();
			String test = in.nextLine();
			int[] b = convertArr(test.split(" "));
			int number = Integer.parseInt(total.split(" ")[1]);
			int q = binarySearch(b, 0, b.length - 1, number);
			if (q == -1) {
				System.out.println("NO");
			} else {
				System.out.println(q + 1);
			}
		}
	}

	public static int[] convertArr(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

	public static int binarySearch(int[] a, int bd, int kt, int number) {
		if (kt >= bd) {
			int middle = bd + (kt - bd) / 2;
			if (number == a[middle]) {
				return middle;
			}
			if (number > a[middle]) {
				return binarySearch(a, middle + 1, kt, number);
			}
			if (number < a[middle]) {
				return binarySearch(a, bd, middle - 1, number);
			}
		}
		return -1;
	}

}
