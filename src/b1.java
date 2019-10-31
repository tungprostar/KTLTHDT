import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		long F[] = new long[100];
		F[0] = 0;
		F[1] = 1;
		for (i = 2; i <= 92; i++)
			F[i] = F[i - 1] + F[i - 2];
		t = in.nextInt();
		while (t-- > 0) {
			n = in.nextInt();
			System.out.println(F[n]);
		}
	}
}