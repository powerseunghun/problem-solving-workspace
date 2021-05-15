package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPascalTrianglePrint1861 {
	static int get(int n, int k) {
		if (k == 1) {
			return 1;
		}
		else if (k > n) return 0;
		else {
			return get(n-1, k-1) + get(n-1, k);
		}
	}
	static void linedraw(int n, int k) {
		if (n <= 0 || k <= 0) return;
		else {
			linedraw(n, k-1);
			System.out.print(get(n, k) + " ");
		}
	}
	static void tPrint(int n, int k) {
		if (n <= 0 || k <= 0) return;
		else {
			tPrint(n-1, k-1);
			linedraw(n, k);
			System.out.println();
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		tPrint(n, n);
	}
}
