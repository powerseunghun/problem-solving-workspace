package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheaterSeatBatch2651 {
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
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(comb(n, r));
	}
}
