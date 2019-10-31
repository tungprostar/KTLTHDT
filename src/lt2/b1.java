package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		String test = in.nextLine();
		int[] b = convertArr(test.split(" "));
		int buoc = 1;
		for (int x = 0; x < i - 1; x++) {
			for (int y = x + 1; y < i; y++) {
				if (b[x] > b[y]) {
					int temp = b[x];
					b[x] = b[y];
					b[y] = temp;
				}
			}
			System.out.println("Buoc " + buoc + ": " + printArr(b));
			buoc++;
		}
	}

	public static int[] convertArr(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

	public static String printArr(int[] a) {
		String s = "";
		for (int x = 0; x < a.length; x++) {
			s += a[x] + " ";
		}
		return s.trim();
	}
}
