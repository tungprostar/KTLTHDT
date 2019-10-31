import java.util.Scanner;

public class b24 {
	public static void main(String[] args) {
		int tien[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		i = in.nextInt();
		in.nextLine();
		while (j++ <= i) {
			int step = 0;
			int k = in.nextInt();
			for (int x = tien.length - 1; x >= 0; x--) {
				if (k % tien[x] == 0) {
					step += k / tien[x];
					break;
				} else {
					step += k / tien[x];
					k = k % tien[x];
				}
			}
			System.out.println(step);
		}
	}
}
