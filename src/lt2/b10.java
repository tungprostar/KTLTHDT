package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		String test = in.nextLine();
		int[] b = convertArr(test.split(" "));
		Arrays.sort(b);
		int days = in.nextInt();
		while (days-- > 0) {
			int price = in.nextInt();
			System.out.println(binarySearch(b, price));
		}

	}

	public static int[] convertArr(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

	public static int binarySearch(int[] a, int number) {
		int count = 0;
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (number >= a[mid]) {
				count = mid + 1;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return count;
	}
}
