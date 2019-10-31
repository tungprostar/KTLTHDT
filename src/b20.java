import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b20 {
	static int s;
	static int step = 0;
	static int index = 0;
	static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String first = in.nextLine();
		String[] a = first.split(" ");
		s = Integer.valueOf(a[1]);
		n = Integer.valueOf(a[0]);
		// a0 = n; a1 = S
//		in.nextLine();
		String second = in.nextLine();
		int[] intArr = convertArr(second.split(" "));
		List<Integer> intLst = new ArrayList<Integer>();
		for (int x = 0; x < intArr.length; x++) {
			intLst.add(intArr[x]);
		}
		Collections.sort(intLst);
		for (int i = n - 1; i >= 0; i--) {
			if (s % intLst.get(i) == 0) {
				step += s / intLst.get(i);
				break;
			} else {
				step += s / intLst.get(i);
				s = s % intLst.get(i);
			}
		}
		System.out.println(step);
	}

	public static int[] convertArr(String[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

}
