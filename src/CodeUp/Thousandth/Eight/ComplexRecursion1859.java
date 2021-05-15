package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComplexRecursion1859 {
	static void draw(int n) {
		if (n <= 0) return;
		draw(n-1);
		System.out.print("*");
	}
	static void f(int n) {
		if (n <= 0) return;
		else {
			f(n-1);
			draw(n);
			System.out.println();
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
