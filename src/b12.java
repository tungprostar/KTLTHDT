import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class b12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;

		j = 1;
		i = in.nextInt();
		in.nextLine();
		while (j++ <= i) {
			String s1 = in.nextLine();
			s1 = s1.trim();
			s1 = s1.toLowerCase();
			s1 = s1.replaceAll("\\s+", " ");
			String temp[] = s1.split(" ");
			String name = "";
			for (String sa : temp) {
				StringBuilder s = new StringBuilder(sa);
				String first = String.valueOf(s.charAt(0)).toUpperCase();
				String nd  = s.substring(1, s.length());
				sa = first + nd;
				name += sa + " ";
			}
			System.out.println(name.trim());

		}
	}
}
