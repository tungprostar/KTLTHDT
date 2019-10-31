import java.util.Scanner;

public class b19 {
	static int bsnn = 108;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		i = in.nextInt();
		in.nextLine();
		while (j++ <= i) {
			int k = in.nextInt();
//			int  = in.nextLine();
			int asi = 1;
			while (k > 0) {
				if (bsnn % k == 0) {
					if (checkZN(bsnn)) {
						System.out.println(bsnn);
						bsnn = 9;
						asi = 1;
						break;
					} else {
						bsnn = k * (9 * asi);
						asi++;
					}
				} else {
					bsnn = k * (9 * asi);
					asi++;
				}
			}
		}
	}

	public static int findNumber(int a) {
		String a1 = "1";
		int c = 0;
		while (c < a - 1) {
			a1 += "0";
			c++;
		}
		return Integer.parseInt(a1);
	}

	public static boolean checkZN(int bsnn) {
		int bs = bsnn % findNumber(String.valueOf(bsnn).length());
		while (String.valueOf(bs).length() > 1) {
			bs = bs % findNumber(String.valueOf(bs).length());
		}
		if (bs == 0) {
			return false;
		}
		if (bs % 9 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
