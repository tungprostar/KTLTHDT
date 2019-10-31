package lt3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class b12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // dinh
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 1) {
					System.out.print(j + 1 + " ");
				}
				System.out.println();
			}
		}
	}

}


//int[][] a = new int[n][n];
//for (int i = 0; i < n; i++) {
//	String s = in.nextLine();
//	String[] ar = s.split(" ");
//	for (String str : ar) {
//		a[i][Integer.parseInt(str) - 1] = 1;
//	}
//}
//for (int i = 0; i < n; i++) {
//	for (int j = 0; j < n; j++) {
//		System.out.print(a[i][j] + " ");
//	}
//	System.out.println();
//}