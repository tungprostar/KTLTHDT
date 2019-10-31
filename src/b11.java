import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class b11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, String> emails = new HashMap<>();
		int i, j;

		j = 1;
		i = in.nextInt();
		in.nextLine();
		while (j++ <= i) {
			List<String> f = new ArrayList<>();
//			int k = in.nextInt();
			String test = in.nextLine();
			StringBuilder s = new StringBuilder(test);
			String[] a = test.split(" ");
			for (String sa : a) {
				if (sa.length() > 0) {
					f.add(sa.trim().toLowerCase());
				}
			}
			String mail = f.get(f.size() - 1);
			for (int x = 0; x < f.size() - 1; x++) {
				mail += f.get(x).charAt(0);
			}
			mail = mail.trim();
			for (int x = 0; x < i; x++) {
				String tempMail = mail;
				if (x != 0) {
					tempMail = tempMail + String.valueOf(x + 1);
				}
				if (!emails.containsKey(tempMail)) {
					emails.put(tempMail, tempMail);
					mail = tempMail;
					break;
				}
			}
			System.out.println(mail + "@ptit.edu.vn");
		}
	}
}
