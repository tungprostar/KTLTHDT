package lt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a[] = new long[100001];
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		for (int x = 0; x < i; x++) {
			a[x] = in.nextLong();
		}
		Arrays.sort(a, 0, i);
		for (int x = 0; x < i; x++) {
			System.out.print(a[x] + " ");
		}
	}

}
