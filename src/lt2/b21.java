package lt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class b21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		while (i-- > 0) {
			List<Integer> lst = new ArrayList<Integer>();
			int totalNumb = in.nextInt();
			for (int x = 0; x < totalNumb; x++) {
				lst.add(in.nextInt());
			}

			for (int x = 0; x < lst.size() - 1; x++) {
				boolean isCheck = false;
				for (int y = x + 1; y < lst.size(); y++) {
					if (lst.get(x) < lst.get(y)) {
						System.out.print(lst.get(y) + " ");
						isCheck = true;
						break;
					}
					if (!isCheck) {
						if (y == lst.size() - 1) {
							System.out.print("-1 ");
						}
					}
				}

			}
			System.out.print("-1");
			System.out.println();
		}
	}

}
