package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPascalTriangle1858 {
	static int f(int n, int k) {
		if (k == 0 || k > n) return 0;
		else if (n == 1) return 1;
		else return f(n-1, k-1) + f(n-1, k);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		System.out.println(f(n, k));
	}
}
