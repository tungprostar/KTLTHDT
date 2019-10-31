package lt3;

import java.util.Arrays;
import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		int f[][] = new int[a.length() + 1][b.length() + 1];

		for (int i = 1; i <= a.length(); i++) {
			for (int j = 1; j <= b.length(); j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					f[i][j] = f[i - 1][j - 1] + 1;
				} else {
					f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
				}
			}
		}
		System.out.println(f[a.length()][b.length()]);
		in.close();
	}

}


//for (int i = 0; i <= m; i++) {
//	for (int j = 0; j <= n; j++) {
//		if (i == 0 || j == 0) {
//			dp[i][j] = 0;
//		} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
//			dp[i][j] = 1 + dp[i - 1][j - 1];
//		} else {
//			dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//		}
//	}
//}
//System.out.println(dp[m][n]);