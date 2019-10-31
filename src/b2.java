import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;
		
		j = 1;
		i = in.nextInt();
		while (j++ <= i) {
			int k = in.nextInt();
			in.nextLine();
			String test = in.nextLine();
			StringBuilder s = new StringBuilder(test);
			if(String.valueOf(s.reverse()).equals(test)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
