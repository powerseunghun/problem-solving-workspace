package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GaussSum2727 {
	static long getGaussSum(int n, int m) {
		long sum = (m - n) + 1;
		if (sum % 2 == 0) {
			return (n + m) * (sum / 2);
		}
		else {
			return ((n + m) * (sum / 2)) + (n + m) / 2;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			tmp = br.readLine();
			int n = Integer.parseInt(tmp.split(" ")[0]);
			int m = Integer.parseInt(tmp.split(" ")[1]);
			System.out.println("Scenario #" + i + ":");
			System.out.println(getGaussSum(n, m) + "\n");
		}
	}
}
