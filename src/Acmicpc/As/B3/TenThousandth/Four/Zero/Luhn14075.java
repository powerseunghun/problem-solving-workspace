package Acmicpc.As.B3.TenThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Luhn14075 {
	static int getDigit(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	static int func(String str) {
		int sum = 0;
		for (int i = 0, val = 0; i < str.length(); i++) {
			val = str.charAt(i)-'0';
			if (i % 2 != 0) {
				sum += val;
				continue;
			}
			val *= 2;
			sum += val >= 10 ? getDigit(val) : val;
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = func(str);
		
		if (sum % 10 == 0) {
			System.out.println("DA");
		}
		else System.out.println("NE");
		
		br.close();
	}
}
