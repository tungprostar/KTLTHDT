package lt2;

import java.util.Arrays;
import java.util.Scanner;

public class b3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		String test = in.nextLine();
		int[] b = convertArr(test.split(" "));
		int buoc = 0;
		System.out.println("Buoc " + buoc + ": " + b[0]);
		buoc++;
		int position;
		int insertVal;
		for (int x = 1; x < i; x++) {
			position = x;
			insertVal = b[x];
			while (position > 0 && b[position - 1] > insertVal) {
				b[position] = b[position - 1];
				position = position - 1;
			}
			b[position] = insertVal;
			System.out.println("Buoc " + buoc + ": " + printArr(b, buoc));
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

	public static String printArr(int[] a, int buoc) {
		String s = "";
		for (int x = 0; x <= buoc; x++) {
			s += a[x] + " ";
		}
		return s.trim();
	}
}
