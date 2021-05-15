package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionStairs1856 {
	static int f(int n) {
		if (n == 1) return 1;
		else if (n == 2) return f(1) + 1;
		else if (n == 3) return f(2) + f(1) + 1;
		else return f(n-1) + f(n-2) + f(n-3);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Integer.parseInt(br.readLine())));
		
	}
}
