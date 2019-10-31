import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b5 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		String a = in.nextLine();
		int[] ar = convertArr(a.split(" "));
		while(j++ <= ar[0]) {
			String test = in.nextLine();
			lst.add(test);
		}
		String[][] arr1 = new String[ar[0]][ar[1]];
	
		for(int x = 0; x < ar[0]; x ++) {
			String[] u = lst.get(x).split(" ");
			for(int y = 0; y < ar[1]; y++) {	
				arr1[x][y] = u[y];
			}
		}
		for(int x = 0; x < ar[1]; x ++) {
			String s = "";
			for(int y = 0; y < ar[0]; y++) {	
				s += arr1[y][x] + " ";
			}
			System.out.println(s.trim());
			
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
