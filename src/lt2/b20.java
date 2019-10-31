package lt2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class b20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, t, n;
		i = in.nextInt();
		in.nextLine();
		while (i-- > 0) {
			boolean isCheck = true;
			Stack<Character> stack = new Stack<Character>();
			String test = in.nextLine();
			for (int x = 0; x < test.length(); x++) {
				if (test.charAt(x) == '[' || test.charAt(x) == '{' || test.charAt(x) == '(') {
					stack.push(test.charAt(x));
				}
				if (test.charAt(x) == ']') {
					if (!stack.isEmpty()) {
						if (stack.peek() == '[') {
							stack.pop();
						}
					} else {
						isCheck = false;
						break;
					}
				}
				if (test.charAt(x) == '}') {
					if (!stack.isEmpty()) {
						if (stack.peek() == '{') {
							stack.pop();
						}
					} else {
						isCheck = false;
						break;
					}
				}
				if (test.charAt(x) == ')') {
					if (!stack.isEmpty()) {
						if (stack.peek() == '(') {
							stack.pop();
						}
					} else {
						isCheck = false;
						break;
					}
				}
			}
			if (!isCheck)
				System.out.println("NO");
			else if (!stack.isEmpty())
				System.out.println("NO");
			else if (stack.isEmpty())
				System.out.println("YES");
		}
	}

}
