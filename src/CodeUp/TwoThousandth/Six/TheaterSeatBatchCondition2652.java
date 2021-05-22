package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheaterSeatBatchCondition2652 {
	static long f(int n) {
		if (n <= 1) return 1;
		else return n * f(n-1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(f(n-r+1) / (f(r) * f(n-r-r+1)));
	}
}
