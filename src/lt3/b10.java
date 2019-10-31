package lt3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class b10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // dinh
		int m = in.nextInt(); // canh
		Map<Integer, String> map = new TreeMap<>();
		for (int i = 0; i < m; i++) {
			int d1 = in.nextInt();
			int d2 = in.nextInt();
			if (!map.containsKey(d1)) {
				map.put(d1, "" + d2 + " ");
			} else {
				map.put(d1, map.get(d1) + d2 + " ");
			}
			if (!map.containsKey(d2)) {
				map.put(d2, "" + d1 + " ");
			} else {
				map.put(d2, map.get(d2) + d1 + " ");
			}
		}
		map.forEach((k, v) -> System.out.println(v.trim()));
	}

}
