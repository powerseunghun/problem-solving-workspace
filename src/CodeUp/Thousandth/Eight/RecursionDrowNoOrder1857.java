package CodeUp.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionDrowNoOrder1857 {
	static int f(int n, int r) {
		if (r > n) return 0;
		else if (r == 1) return n;
		else if (n == r) return 1;
		else return f(n-1, r-1) + f(n-1, r);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(f(n, r));
	}
}
