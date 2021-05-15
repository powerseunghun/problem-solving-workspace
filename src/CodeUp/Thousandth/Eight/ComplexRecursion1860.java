package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComplexRecursion1860 {
	static void list(int n) {
		if (n <= 0) return;
		else {
			list(n-1);
			System.out.print(n + " ");
		}
	}
	static void f(int n) {
		if (n <= 0) return;
		else {
			f(n-1);
			list(n);
			System.out.println();
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
