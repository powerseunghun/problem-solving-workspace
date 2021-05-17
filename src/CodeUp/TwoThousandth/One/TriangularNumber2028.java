package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangularNumber2028 {
	static int divCount(int n) {
		int count = 0, i = 0;
		for (i = 1; i * i < n; i++) {
			if (n % i == 0) count+=2;
		}
		if (i * i == n) count++;
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		int num = 0;
		for (int i = 1; ; num += i, i++) {
			if (num == 0) continue;
			if (divCount(num) > k) {
				System.out.println(num);
				return;
			}
		}
	}
}
