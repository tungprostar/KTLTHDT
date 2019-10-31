import java.util.Scanner;

public class b9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		i = in.nextInt();
		in.nextLine();
		while (j++ <= i) {
//			int k = in.nextInt();
			String test = in.nextLine();
			if (test.endsWith("8")) {
				long testInt = 0L;
				String[] s1 = test.split("");
				for(String t : s1) {
					testInt += Long.parseLong(t);
				}
				if(testInt % 10 == 0) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
	}
}
