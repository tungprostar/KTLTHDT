import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b6 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int i, j, k;
		i = 1;
		j = 1;
		k = in.nextInt();
		in.nextLine();
		String a = in.nextLine();
		int[] ar = convertArr(a.split(" "));
		while (i++ <= k) {

			while (j++ <= ar[0]) {
				String test = in.nextLine();
				lst.add(test);
			}
			int[][] arr1 = new int[ar[0]][ar[1]];
			int[][] arr2 = new int[ar[1]][ar[0]];
			int[][] arr3 = new int[arr1[0].length][arr1[0].length];
			for (int x = 0; x < ar[0]; x++) {
				String[] u = lst.get(x).split(" ");
				for (int y = 0; y < ar[1]; y++) {
					arr1[x][y] = Integer.parseInt(u[y]);
				}
			}
			for (int x = 0; x < ar[1]; x++) {
				for (int y = 0; y < ar[0]; y++) {
					arr2[x][y] = arr1[y][x];
				}
			}
			for (int x = 0; x < ar[0]; x++) {
				for (int y = 0; y < ar[1]; y++) {
					for (int z = 0; z < ar[0]; z++) {
						arr3[x][z] += arr1[x][y] * arr2[y][z];
					}
				}
			}
			System.out.println("Test " + (i - 1) + ":");
			for (int x = 0; x < arr3.length; x++) {
				String s = "";
				for (int y = 0; y < arr3.length; y++) {
					s += String.valueOf(arr3[x][y]) + " ";
				}
				System.out.println(s.trim());
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
