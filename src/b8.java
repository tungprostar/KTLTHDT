import java.util.Scanner;

public class b8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;
		
		j = 1;
		i = in.nextInt();
		in.nextLine();
		while (j++ <= i) {
//			int k = in.nextInt();
			String test = in.nextLine();
			StringBuilder s = new StringBuilder(test);
			if(test.contains("1") || test.contains("3") || test.contains("5") || test.contains("7") || test.contains("9")) {
				System.out.println("NO");
			}
			else {
				if(String.valueOf(s.reverse()).equals(test)) {
					System.out.println("YES");
				}
			}
		}
	}
}
