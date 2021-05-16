package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPrintTriangle1954 {
	static void draw(int n) {
		if (n <= 0) return;
		else {
			draw(n-1);
			System.out.print("*");
		}
	}
	static void f(int n) {
		if (n <= 0) return;
		else {
			draw(n);
			System.out.println();
			f(n-1);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		f(Integer.parseInt(br.readLine()));
	}
}
