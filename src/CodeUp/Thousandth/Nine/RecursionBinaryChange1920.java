package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionBinaryChange1920 {
	static void f(int n) {
		if (n == 0) return;
		else {
			f(n/2);
			System.out.print(n%2);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n == 0) System.out.print("0");
		else f(n);
	}
}
