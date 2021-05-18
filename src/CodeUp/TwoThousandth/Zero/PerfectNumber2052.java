package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PerfectNumber2052 {
	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum = (i == Math.sqrt(n)) ? sum + i : sum + i + (n / i);
			}
		}
		if (sum-n == n) return true;
		else return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			if (isPerfect(Integer.parseInt(st.nextToken()))) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
