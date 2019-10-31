
public class test {
	int[] a = new int[100];
	int n = 3;

	public static void main(String[] args) {
		test a = new test();
		a.tryIn(1);
	}

	public void intKQ(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public void tryIn(int i) {
		for (int j = 0; j <= 1; j++) {
			a[i] = j;
			if (i == n) {
				intKQ(a, n);
				break;
			} else
				tryIn(i + 1);
		}
	}
}
