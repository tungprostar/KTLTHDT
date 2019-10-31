package lt3;

import java.util.Arrays;
import java.util.Scanner;

public class b4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		int[] f = new int[s + 1];
//		Arrays.fill(f, 1);

		f[0] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = s; j >= nums[i]; j--) {
				if (f[j] == 0 && f[j - nums[i]] == 1) {
					f[j] = 1;
				}
			}
		}
		System.out.println(f[n] == 1 ? "YES" : "NO");
		in.close();
	}

}
