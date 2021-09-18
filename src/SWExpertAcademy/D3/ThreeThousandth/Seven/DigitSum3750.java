package SWExpertAcademy.D3.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitSum3750 {
	static long digitSum(long n) {
		long sum = 0;
		while (n != 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long n = 0;
		
		for (int i = 1; i <= T; i++) {
			n = Long.parseLong(br.readLine());
			while (n >= 10) {
				n = digitSum(n);
			}
			sb.append("#" + i + " " + n + "\n");
		}
		System.out.print(sb.toString());
	}
}
