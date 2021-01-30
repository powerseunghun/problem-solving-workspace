package basic;

import java.util.Scanner;

public class RecursionNumeric {
	public void numeric(int n, int k) {
		char[] numeric = new char[]
				{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		if (n < k) {
			System.out.print(numeric[n]);
		}
		else {
			numeric(n / k, k);
			System.out.print(numeric[n % k]);
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new RecursionNumeric().numeric(sc.nextInt(), sc.nextInt());
	}
}
