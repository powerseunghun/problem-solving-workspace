package Acmicpc.As.B3.TwentyThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LongMultiplication27130 {
	static String func(String str, int n) {
		StringBuilder sb = new StringBuilder();
		int val = 0, carry = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			val = (str.charAt(i)-'0') * n + carry;
			sb.append(val%10);
			carry = val / 10;
		}
		sb.append(carry == 0 ? "" : carry);
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		String ba = A.toString();
		String bb = B.toString();
		
		sb.append(ba + "\n" + bb + "\n");
		
		for (int i = bb.length()-1; i >= 0; i--) {
			sb.append(func(ba, bb.charAt(i)-'0')+"\n");
		}
		sb.append(A.multiply(B)+"\n");
		
		System.out.print(sb.toString());
		br.close();
	}
}
