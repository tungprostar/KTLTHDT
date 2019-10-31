import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class b4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		i = in.nextInt();
		while (j++ <= i) {
			LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
			int k = in.nextInt();
			in.nextLine();
			String test = in.nextLine();
			String[] a = test.split(" ");
			int[] b = convertArr(a);
			for (int x = 0; x < a.length; x++) {
				if (map.get(b[x]) == null) {
					map.put(b[x], 1);
				} else {
					int value = map.get(b[x]);
					map.put(b[x], value + 1);
				}
			}
			System.out.println("Test " + (j - 1) + ":");
			for (Entry<Integer, Integer> entry : map.entrySet()) {
			    System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
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
