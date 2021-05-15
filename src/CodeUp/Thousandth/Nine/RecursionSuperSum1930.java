package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionSuperSum1930 {
	static int f(int k, int n) {
		if(k == 0) return n;
		else {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += f(k-1, i);
			}
			return sum;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int k = 0, n = 0;
		while((tmp = br.readLine()) != null) {
			k = Integer.parseInt(tmp.split(" ")[0]);
			n = Integer.parseInt(tmp.split(" ")[1]);
			System.out.println(f(k, n));
		}
	}
}
