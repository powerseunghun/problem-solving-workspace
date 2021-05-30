package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigDigitAdd3021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s1 = br.readLine(), s2 = br.readLine();
		int i = 0, j = 0;
		int carry = 0, v1 = 0, v2 = 0, tmp = 0;
		for (i = s1.length()-1, j = s2.length()-1; i >= 0 && j >= 0; i--, j--) {
			v1 = (s1.charAt(i) - '0');
			v2 = (s2.charAt(j) - '0');
			tmp = v1 + v2 + carry;
			carry = tmp / 10;
			sb.append(tmp % 10);
			if (i == 0 && j == 0 && carry != 0) {
				sb.append(carry);
				carry = 0;
			}
		}
		for (; i >= 0; i--) {
			tmp = (s1.charAt(i) - '0') + carry;
			sb.append(tmp % 10);
			carry = tmp / 10;
		}
		for (; j >= 0; j--) {
			tmp = (s2.charAt(j) - '0') + carry;
			sb.append(tmp % 10);
			carry = tmp / 10;
		}
		if (carry != 0) sb.append(carry);
		
		System.out.println(sb.reverse().toString());
	}
}
