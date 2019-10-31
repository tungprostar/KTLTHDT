package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		while (i-- > 0) {
			String total = in.nextLine();
			String test = in.nextLine();
			int[] b = convertArr(test.split(" "));
			Arrays.sort(b);
			System.out.println(printArr(b));
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
