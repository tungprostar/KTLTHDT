import java.util.Scanner;

public class b10 {
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
			if(test.contains("4") || test.contains("6") || test.contains("9") || test.contains("8") ) {
				System.out.println("NO");
			}
			else {
				if(String.valueOf(s.reverse()).equals(test)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
}
