package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcelColumnOrder2031 {
	static int getNumber(String s) {
		int sum = 0, pow = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			sum += Math.pow(26, pow) * (s.charAt(i) - 64);
			pow++;
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(getNumber(br.readLine()));
	}
}
