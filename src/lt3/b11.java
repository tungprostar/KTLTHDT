package lt3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class b11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // dinh
		in.nextLine();
		for (int i = 1; i <= n; i++) {
			String s = in.nextLine();
			String[] ar = s.split(" ");
//			for (int x = 0; x < dinh.length; x++) {
//				dinh[x] = Integer.parseInt(ar[x]);
//			}
			for (int x = 0; x < ar.length; x++) {
				int dinh = Integer.parseInt(ar[x]);
				if (i < dinh)
					System.out.println(i + " " + ar[x]);
			}
		}
	}

}
