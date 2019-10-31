package lt2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class b12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger b = new BigInteger(String.valueOf(1000000000 + 7));
		int i, t;
		i = in.nextInt();
		in.nextLine();
		while (i-- > 0) {
			String test = in.nextLine();
			int n = Integer.parseInt(test.split(" ")[0]);
			int k = Integer.parseInt(test.split(" ")[1]);
			BigInteger b1 = new BigInteger(n + "");
			BigInteger b2 = new BigInteger(k + "");
			BigInteger result = b1.modPow(b2, b);
			System.out.println(result);
		}
	}

}
