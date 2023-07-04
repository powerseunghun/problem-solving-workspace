package Acmicpc.As.B2.TwentyThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CountNumber21567 {
	static final int len = 10;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[len];
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		BigInteger C = new BigInteger(br.readLine());
		String str = A.multiply(B).multiply(C).toString();
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-'0']++;
		}
		
		for (int el : arr) {
			sb.append(el).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
