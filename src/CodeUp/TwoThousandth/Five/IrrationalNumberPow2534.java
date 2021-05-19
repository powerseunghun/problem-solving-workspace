package CodeUp.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IrrationalNumberPow2534 {
	// time limit solution complex yet
	static int combination(int n, int k) {
		if (n == k || k == 0) return 1;
		else return combination(n-1, k-1) + combination(n-1, k);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int n = Integer.parseInt(tmp.split(" ")[3]);
		double y = b * Math.sqrt(c);
		double f = 0;
		
		for (int k = 0; k <= n; k++) {
			f += (combination(n, k) * Math.pow(x, n-k) * Math.pow(y, k));
		}
		
		System.out.println(f % 1000000007);
	}
}
