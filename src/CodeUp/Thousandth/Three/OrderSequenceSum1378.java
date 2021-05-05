package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderSequenceSum1378 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 1, a1 = 1;
		for (int i = 2; i <= n; i++) {
			sum += a1 + (i-1) * (2 * 2 + (i-2)) / 2;
		}
		
		System.out.println(sum);
	}
}
