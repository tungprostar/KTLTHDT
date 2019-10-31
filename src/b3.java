import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		i = in.nextInt();
		while (j++ <= i) {
			List<String> lst = new ArrayList<>();
			int k = in.nextInt();
			in.nextLine();
			String test = in.nextLine();
			String[] a = test.split(" ");
			int[] b = convertArr(a);
			String str = "";
			for (int x = 0; x < a.length; x++) {
				if (x == a.length - 1) {
					if (b[x - 1] < b[x]) {
						str += b[x] + " ";
					}
					lst.add(str.trim());
				} else if (x < a.length) {
					if (b[x] < b[x + 1]) {
						str += b[x] + " ";
					}
					if (b[x] > b[x + 1]) {
						str += b[x] + " ";
						lst.add(str.trim());
						str = "";
					}
				}
			}
			System.out.println("Test " + (j - 1) + ":");
			int max = 0;
			for (String ss : lst) {
				String[] ab = ss.split(" ");
				if (ab.length > max)
					max = ab.length;
			}
			System.out.println(max);
			for (String ss : lst) {
				if (ss.split(" ").length == max) {
					System.out.println(ss);
				}
			}
		}
	}

	public static int[] convertArr(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

}
