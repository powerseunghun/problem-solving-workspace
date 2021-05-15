package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPower1917 {
	static long rPow(long n, long k, long acc) {
		if (k <= 0) return acc;
		if (n == 1) return 1;
		if (n == -1) {
			if (k % 2 == 0) return 1;
			else return -1;
		}
		acc *= n;
		return rPow(n, k-1, acc);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		System.out.println(rPow(n, k, 1));
	}
}
