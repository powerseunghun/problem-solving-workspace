package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationTiny1288 {
	// tiny but impl recursion
	static int comb(int n, int r) {
		if (n == r || r == 0) {
			return 1;
		}
		else {
			return comb(n-1, r-1) + comb(n-1, r);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		System.out.println(comb(Integer.parseInt(tmp.split(" ")[0]), Integer.parseInt(tmp.split(" ")[1])));
	}
}
