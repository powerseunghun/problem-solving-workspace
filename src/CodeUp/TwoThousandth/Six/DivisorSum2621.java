package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorSum2621 {
	static int getSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += n%i == 0 ? i : 0;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getSum(N));
	}
}
