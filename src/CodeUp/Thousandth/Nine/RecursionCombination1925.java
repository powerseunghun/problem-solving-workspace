package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionCombination1925 {
	static int combination(int n, int r) {
		if (n == r || r == 0) return 1;
		else return combination(n-1, r-1) + combination(n-1, r);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		System.out.println(combination(n, r));
	}
}
