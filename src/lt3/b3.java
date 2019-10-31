package lt3;

import java.util.Arrays;
import java.util.Scanner;

public class b3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		int[] f = new int[nums.length];
		Arrays.fill(f, 1);

		int result = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					f[i] = Math.max(f[i], f[j] + 1);
				}
			}
			result = Math.max(f[i], result);
		}
		System.out.println(result);
		in.close();
	}

}
