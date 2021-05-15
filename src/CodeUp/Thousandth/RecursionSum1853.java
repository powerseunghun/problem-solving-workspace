package CodeUp.Thousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionSum1853 {
	static int f(int n) {
		if (n <= 0) return 0;
		else return n + f(n-1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Integer.parseInt(br.readLine())));
	}
}
