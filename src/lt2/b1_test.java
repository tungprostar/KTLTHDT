package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b1_test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, n;
		n = in.nextInt();
		in.nextLine();
		String test = in.nextLine();
		int[] a = convertArr(test.split(" "));
		int buoc = 1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print("Buoc " + (i + 1) + ": ");
			for (int k = 0; k < n; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
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
