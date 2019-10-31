import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class b25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		i = in.nextInt();
		in.nextLine();
		while (j++ <= i) {
			int k = in.nextInt();
			String testts = "";
			in.nextLine();
			while (k-- > 0) {
				String test = in.nextLine();
				testts += test + "\n";
			}
			String test1[] = testts.split("\n");
			List<Integer> total = new ArrayList<>();
			for (int x = 0; x < test1.length; x++) {
				Stack<Integer> stack = new Stack<>();
				boolean flag = true;
				int tong = 0;
				for (int y = x; y < test1.length; y++) {
					String s1[] = test1[y].split(" ");
					if (flag) {
						flag = false;
						stack.push(Integer.parseInt(s1[0]));
						stack.push(Integer.parseInt(s1[1]));
						tong++;
					} else {
						if (stack.get(stack.size() - 1) < Integer.parseInt(s1[0])) {
							stack.push(Integer.parseInt(s1[0]));
							stack.push(Integer.parseInt(s1[1]));
							tong++;
						}
					}
				}
				total.add(tong);
				stack.clear();
			}
			System.out.println(Collections.max(total));
		}
	}
}
