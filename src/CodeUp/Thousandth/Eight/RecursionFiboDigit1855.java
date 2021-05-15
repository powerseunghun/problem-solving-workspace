package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionFiboDigit1855 {
	static int f(int n) {
		if (n == 1 || n == 2) return 1;
		else return f(n-1) + f(n-2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Integer.parseInt(br.readLine())));
	}
}
